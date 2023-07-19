package com.spigburger.app.dto;

import com.spigburger.app.entities.Lanche;

public class LancheDTO {
    private String name;
    private Double price;
    private String shortDescription;

    public LancheDTO(LancheRequestDTO entity) {
        this.name = entity.name();
        this.price = entity.price();
        this.shortDescription = entity.shortDescription();
    }

    public LancheDTO(Lanche entity) {
        this.name =  entity.getName();
        this.price = entity.getPrice();
        this.shortDescription = entity.getShortDescription();
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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
