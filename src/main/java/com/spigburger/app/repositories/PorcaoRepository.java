package com.spigburger.app.repositories;

import com.spigburger.app.entities.Porcao;
import com.spigburger.app.projections.LancheMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PorcaoRepository extends JpaRepository<Porcao, Long> {

}
