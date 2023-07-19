package com.spigburger.app.controllers;

import com.spigburger.app.dto.LancheMinDTO;
import com.spigburger.app.dto.PorcaoDTO;
import com.spigburger.app.dto.PorcaoMinDTO;
import com.spigburger.app.services.PorcaoService;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/porcoes")
public class PorcaoController {
    @Autowired
    private PorcaoService porcaoService;

    @GetMapping(value = "/{id}")
    public PorcaoDTO findById(@PathVariable Long id) {
        return porcaoService.findById(id);
    }

    @GetMapping
    public List<PorcaoMinDTO> findAll() { return  porcaoService.findAll(); }

    @GetMapping(value = "/below/{searchPrice}/porcoes")
    public List<PorcaoMinDTO>findBelowPrice(@PathVariable Double searchPrice) {
        return  porcaoService.filterBelowPrice(searchPrice);
    }

    @GetMapping(value = "/above/{searchPrice}/porcoes")
    public List<PorcaoMinDTO>findAbovePrice(@PathVariable Double searchPrice) {
        return porcaoService.filterAbovePrice(searchPrice);
    }
}
