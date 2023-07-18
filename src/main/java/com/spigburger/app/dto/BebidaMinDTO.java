package com.spigburger.app.dto;

import com.spigburger.app.entities.Bebida;
import com.spigburger.app.projections.BebidaMinProjection;

public class BebidaMinDTO {
    private Long id;
    private String name;
    private double price;


    public BebidaMinDTO() {
    }

    public BebidaMinDTO(Bebida entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }

    public BebidaMinDTO(BebidaMinProjection entity) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
