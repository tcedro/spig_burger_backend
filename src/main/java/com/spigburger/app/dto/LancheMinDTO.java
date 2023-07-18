package com.spigburger.app.dto;

import com.spigburger.app.entities.Lanche;
import com.spigburger.app.projections.LancheMinProjection;

public class LancheMinDTO {
    private Long id;
    private Double price;
    private String name;

    public LancheMinDTO() {
    }

    public LancheMinDTO(Lanche entity) {
        this.id = entity.getId();
        this.price = entity.getPrice();
        this.name = entity.getName();
    }

    public LancheMinDTO(LancheMinProjection entity) {
        this.id = entity.getId();
        this.price = entity.getPrice();
        this.name = entity.getName();
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
