package com.spigburger.app.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private LancheBelongingPK lancheId = new LancheBelongingPK();
    private Integer position;

    public Belonging() {
    }

    public Belonging(Lanche lanche, Categoria categoria, Integer position){
        lancheId.setLanche(lanche);
        lancheId.setCategoria(categoria);

        this.position = position;
    }

    public LancheBelongingPK getLancheId() {
        return lancheId;
    }

    public void setLancheId(LancheBelongingPK lancheId) {
        this.lancheId = lancheId;
    }


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
