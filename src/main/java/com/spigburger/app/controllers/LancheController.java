package com.spigburger.app.controllers;

import com.spigburger.app.entities.Lanche;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lanches")
public class LancheController {
    @GetMapping
    public Lanche getLanche() {
        Lanche l1 = new Lanche(1L, "CrtlF", "Hamburger artesal com Queijo cheader e cebola caramerizalada", "carne 120mg, Cheader, cebola", 22.0);
        return  l1;
    }


}
