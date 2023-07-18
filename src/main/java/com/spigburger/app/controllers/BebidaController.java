package com.spigburger.app.controllers;

import com.spigburger.app.dto.BebidaDTO;
import com.spigburger.app.dto.BebidaMinDTO;
import com.spigburger.app.services.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bebidas")
public class BebidaController {
    @Autowired
    BebidaService bebidaService;

    @GetMapping(value = "/{id}")
    public BebidaDTO findById(@PathVariable Long id) {
        return bebidaService.findById(id);
    }

    @GetMapping
    public List<BebidaMinDTO> findAll() {
        return  bebidaService.findAll();
    }
}
