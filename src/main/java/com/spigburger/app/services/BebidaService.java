package com.spigburger.app.services;

import com.spigburger.app.dto.BebidaDTO;
import com.spigburger.app.dto.BebidaMinDTO;
import com.spigburger.app.entities.Bebida;
import com.spigburger.app.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BebidaService {
    @Autowired
    private BebidaRepository bebidaRepository;

    @Transactional(readOnly = true)
    public BebidaDTO findById(Long id) {
        return new BebidaDTO(bebidaRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<BebidaMinDTO> findAll() {
        List<Bebida> result = bebidaRepository.findAll();
        return result.stream().map(x-> new BebidaMinDTO(x)).toList();
    }

}
