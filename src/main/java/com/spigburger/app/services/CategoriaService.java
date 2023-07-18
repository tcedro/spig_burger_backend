package com.spigburger.app.services;

import com.spigburger.app.dto.CategoriaDTO;
import com.spigburger.app.entities.Categoria;
import com.spigburger.app.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaDTO> findAll() {
        List<Categoria> result = categoriaRepository.findAll();
        return result.stream().map(x -> new CategoriaDTO(x)).toList();
    }
}
