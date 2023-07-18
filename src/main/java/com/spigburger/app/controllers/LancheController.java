package com.spigburger.app.controllers;

import com.spigburger.app.dto.LancheDTO;
import com.spigburger.app.dto.LancheMinDTO;
import com.spigburger.app.services.LancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lanches")
public class LancheController {
    @Autowired
    private LancheService lancheService;

    @GetMapping(value = "/{id}")
    public LancheDTO findById(@PathVariable Long id) {
        return  lancheService.findById(id);
    }

    @GetMapping
    public List<LancheMinDTO> findAll() {
        return lancheService.findAll();
    }

}
