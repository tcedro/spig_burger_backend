package com.spigburger.app.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BebidaBelongingPK {

    @ManyToOne
    @JoinColumn(name = "bebida_id")
    private Bebida bebida;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private Categoria categoria;

    public BebidaBelongingPK() {
    }

    public BebidaBelongingPK(Bebida bebida, Categoria categoria) {
        this.bebida = bebida;
        this.categoria = categoria;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void getCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
