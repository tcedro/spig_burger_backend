package com.spigburger.app.services;

import com.spigburger.app.dto.LancheDTO;
import com.spigburger.app.dto.LancheMinDTO;
import com.spigburger.app.entities.Lanche;
import com.spigburger.app.projections.LancheMinProjection;
import com.spigburger.app.repositories.LancheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LancheService {
    @Autowired
    private LancheRepository lancheRepository;

    @Transactional(readOnly = true)
    public LancheDTO findById(Long id) {
        Lanche result = lancheRepository.findById(id).get();
        return new LancheDTO(result);
    }

    @Transactional(readOnly = true)
    public List<LancheMinDTO> findAll() {
        List<Lanche> result = lancheRepository.findAll();
        return result.stream().map(x-> new LancheMinDTO(x)).toList();
    }

}
