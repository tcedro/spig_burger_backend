package com.spigburger.app.entities;

import com.spigburger.app.dto.BebidaResquestDTO;
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
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Bebida() {
    }

    public Bebida(BebidaResquestDTO entity) {
        this.name = entity.name();
        this.price = entity.price();
        this.shortDescription = entity.shortDescription();
    }

    public Bebida(Long id, String name, boolean isAlcoolica, String shortDescription, Double price, Categoria categoria) {
        this.id = id;
        this.name = name;
        this.isAlcoolica = isAlcoolica;
        this.shortDescription = shortDescription;
        this.price = price;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
