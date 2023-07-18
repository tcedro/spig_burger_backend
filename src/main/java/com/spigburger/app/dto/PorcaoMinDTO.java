package com.spigburger.app.dto;

import com.spigburger.app.entities.Porcao;
import com.spigburger.app.projections.PorcaoMinProjection;

public class PorcaoMinDTO {
    private Long id;
    private Double price;
    private String name;

    public PorcaoMinDTO() {
    }

    public PorcaoMinDTO(Porcao entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }


    public PorcaoMinDTO(PorcaoMinProjection entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
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
