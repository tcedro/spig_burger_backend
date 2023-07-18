package com.spigburger.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_porcao")
public class Porcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String shortDescription;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Porcao() {
    }

    public Porcao(Long id, String name, Double price, String shortDescription, Categoria categoria) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shortDescription = shortDescription;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
