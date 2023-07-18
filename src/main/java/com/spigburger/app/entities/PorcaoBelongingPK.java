package com.spigburger.app.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class PorcaoBelongingPK {
    @ManyToOne
    @JoinColumn(name = "porcao_id")
    private Porcao porcao;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public PorcaoBelongingPK() {
    }

    public Porcao getPorcao() {
        return porcao;
    }

    public void setPorcao(Porcao porcao) {
        this.porcao = porcao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setList(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PorcaoBelongingPK that = (PorcaoBelongingPK) o;
        return Objects.equals(getPorcao(), that.getPorcao()) && Objects.equals(getCategoria(), that.getCategoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPorcao(), getCategoria());
    }
}
