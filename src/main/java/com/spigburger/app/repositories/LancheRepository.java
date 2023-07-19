package com.spigburger.app.repositories;

import com.spigburger.app.entities.Lanche;
import com.spigburger.app.projections.LancheMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LancheRepository extends JpaRepository<Lanche, Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_lanche.id, tb_lanche.name, tb_lanche.price, tb_lanche.short_description
		FROM tb_lanche
		WHERE tb_lanche.price < :belowPrice
			""")
    List<LancheMinProjection> filterBelowPrice(Double belowPrice);

	@Query(nativeQuery = true, value = """
			SELECT tb_lanche.id, tb_lanche.name, tb_lanche.price, tb_lanche.short_description
			FROM tb_lanche WHERE tb_lanche.price > :abovePrice
			""")
	List<LancheMinProjection> filterAbovePrice(Double abovePrice);
}
