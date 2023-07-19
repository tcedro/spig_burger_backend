package com.spigburger.app.dto;

import com.spigburger.app.entities.Lanche;
import com.spigburger.app.projections.LancheMinProjection;

public class LancheMinDTO {
    private Long id;
    private Double price;
    private String name;
    private String shortDescription;

    public LancheMinDTO() {
    }

    public LancheMinDTO(LancheRequestDTO entity) {
        this.name = entity.name();
        this.price = entity.price();
        this.shortDescription = entity.shortDescription();
    }

    public LancheMinDTO(Lanche entity) {
        this.id = entity.getId();
        this.price = entity.getPrice();
        this.name = entity.getName();
        this.shortDescription = entity.getShortDescription();
    }

    public LancheMinDTO(LancheMinProjection entity) {
        this.id = entity.getId();
        this.price = entity.getPrice();
        this.name = entity.getName();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
