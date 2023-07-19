package com.spigburger.app.repositories;

import com.spigburger.app.entities.Porcao;
import com.spigburger.app.projections.PorcaoMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PorcaoRepository extends JpaRepository<Porcao, Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_porcao.id, tb_porcao.name, tb_porcao.price
		FROM tb_porcao
		WHERE tb_porcao.price < :belowPrice
			""")
    List<PorcaoMinProjection> filterBelowPrice(Double belowPrice);

    @Query(nativeQuery = true, value = """
			SELECT tb_porcao.id, tb_porcao.name, tb_porcao.price
			FROM tb_porcao 
			WHERE tb_porcao.price > :abovePrice
			""")
    List<PorcaoMinProjection> filterAbovePrice(Double abovePrice);
}
