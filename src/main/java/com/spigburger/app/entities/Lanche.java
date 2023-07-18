package com.spigburger.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_lanche")
public class Lanche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    private String ingredientes;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Lanche(Long id, String name, String shortDescription, String ingredientes, Double price, Categoria categoria) {
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.ingredientes = ingredientes;
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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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
