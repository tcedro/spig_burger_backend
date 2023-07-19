package com.spigburger.app.repositories;

import com.spigburger.app.entities.Bebida;
import com.spigburger.app.projections.BebidaMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_bebida.id, tb_bebida.name, tb_bebida.price
		FROM tb_bebida
		WHERE tb_bebida.price < :belowPrice
			""")
    List<BebidaMinProjection> filterBelowPrice(Double belowPrice);

    @Query(nativeQuery = true, value = """
			SELECT tb_bebida.id, tb_bebida.name, tb_bebida.price
			FROM tb_bebida WHERE tb_bebida.price > :abovePrice
			""")
    List<BebidaMinProjection> filterAbovePrice(Double abovePrice);

}
