package com.spigburger.app.services;

import com.spigburger.app.dto.*;
import com.spigburger.app.entities.Bebida;
import com.spigburger.app.entities.Lanche;
import com.spigburger.app.projections.BebidaMinProjection;
import com.spigburger.app.projections.LancheMinProjection;
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

    @Transactional(readOnly = true)
    public List<BebidaMinDTO> filterBelowPrice(Double searchPrice) {
        List<BebidaMinProjection> result = bebidaRepository.filterBelowPrice(searchPrice);
        return  result.stream().map(x -> new BebidaMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<BebidaMinDTO> filterAbovePrice(Double searchPrice) {
        List<BebidaMinProjection> result = bebidaRepository.filterAbovePrice(searchPrice);
        return  result.stream().map(x -> new BebidaMinDTO(x)).toList();
    }

    public Bebida save(BebidaResquestDTO data) {
        Bebida bebidaData = new Bebida(data);
        return   bebidaRepository.save(bebidaData);
    }

}
