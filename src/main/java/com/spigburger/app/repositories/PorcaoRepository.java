package com.spigburger.app.repositories;

import com.spigburger.app.entities.Porcao;
import com.spigburger.app.projections.LancheMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PorcaoRepository extends JpaRepository<Porcao, Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_porcao.id, tb_porcao.name, tb_porcao.price
		FROM tb_porcao
		INNER JOIN tb_belonging ON tb_porcao.id = tb_belonging.porcao_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<LancheMinProjection> searchByList(Long listId);
}
