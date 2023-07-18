package com.spigburger.app.repositories;

import com.spigburger.app.entities.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {

}
