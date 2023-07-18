package com.spigburger.app.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class LancheBelongingPK {
    @ManyToOne
    @JoinColumn(name = "lanche_id")
    private Lanche lanche;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public LancheBelongingPK() {
    }

    public LancheBelongingPK(Lanche lanche, Categoria categoria) {
        this.lanche = lanche;
        this.categoria = categoria;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
