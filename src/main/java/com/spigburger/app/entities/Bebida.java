package com.spigburger.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bebida")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean isAlcoolica;
    private String shortDescription;
    private Double price;

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

    public boolean isAlcoolica() {
        return isAlcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        isAlcoolica = alcoolica;
    }
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
