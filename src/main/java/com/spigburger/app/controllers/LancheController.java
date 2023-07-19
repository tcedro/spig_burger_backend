package com.spigburger.app.controllers;

import com.spigburger.app.dto.LancheDTO;
import com.spigburger.app.dto.LancheMinDTO;
import com.spigburger.app.dto.LancheRequestDTO;
import com.spigburger.app.services.LancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lanches")
public class LancheController {
    @Autowired
    private LancheService lancheService;

    @GetMapping(value = "/below/{searchPrice}/lanches")
    public List<LancheMinDTO>findBelowPrice(@PathVariable Double searchPrice) {
        return  lancheService.filterBelowPrice(searchPrice);
    }

    @GetMapping(value = "/above/{searchPrice}/lanches")
    public List<LancheMinDTO>findAbovePrice(@PathVariable Double searchPrice) {
        return lancheService.filterAbovePrice(searchPrice);
    }

    @GetMapping(value = "/{id}")
    public LancheDTO findById(@PathVariable Long id) {
        return  lancheService.findById(id);
    }

    @GetMapping
    public List<LancheMinDTO> findAll() {
        return lancheService.findAll();
    }

    @PostMapping
    public void saveLanche(@RequestBody LancheRequestDTO data){
        lancheService.save(data);
    }

}
