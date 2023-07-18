package com.spigburger.app.repositories;

import com.spigburger.app.entities.Lanche;
import com.spigburger.app.projections.LancheMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LancheRepository extends JpaRepository<Lanche, Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_lanche.id, tb_lanche.name, tb_lanche.price
		FROM tb_lanche
		INNER JOIN tb_belonging ON tb_lanche.id = tb_belonging.lanche_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<LancheMinProjection> searchByList(Long listId);
}
