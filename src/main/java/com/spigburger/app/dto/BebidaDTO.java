package com.spigburger.app.dto;

import com.spigburger.app.entities.Bebida;

public class BebidaDTO {
    private String name;
    private Double price;
    private Long id;

    public BebidaDTO(Bebida entity) {
        this.name =  entity.getName();
        this.price = entity.getPrice();
        this.id = entity.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
