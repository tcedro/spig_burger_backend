package com.spigburger.app.dto;

import com.spigburger.app.entities.Categoria;

public class CategoriaDTO {
    private Long id;
    private String name;

    public CategoriaDTO(){}

    public CategoriaDTO(Categoria entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
