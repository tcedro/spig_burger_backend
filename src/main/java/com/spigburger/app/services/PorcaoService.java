package com.spigburger.app.services;

import com.spigburger.app.dto.*;
import com.spigburger.app.entities.Lanche;
import com.spigburger.app.entities.Porcao;
import com.spigburger.app.projections.PorcaoMinProjection;
import com.spigburger.app.repositories.PorcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PorcaoService {
    @Autowired
    private PorcaoRepository porcaoRepository;

    @Transactional(readOnly = true)
    public PorcaoDTO findById(Long id) {
        return  new PorcaoDTO(porcaoRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<PorcaoMinDTO> findAll() {
        List<Porcao> result = porcaoRepository.findAll();
        return result.stream().map(x-> new PorcaoMinDTO((x))).toList();
    }

    @Transactional(readOnly = true)
    public List<PorcaoMinDTO> filterBelowPrice(Double searchPrice) {
        List<PorcaoMinProjection> result = porcaoRepository.filterBelowPrice(searchPrice);
        return  result.stream().map(x -> new PorcaoMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<PorcaoMinDTO> filterAbovePrice(Double searchPrice) {
        List<PorcaoMinProjection> result = porcaoRepository.filterAbovePrice(searchPrice);
        return  result.stream().map(x -> new PorcaoMinDTO(x)).toList();
    }

    public Porcao save(PorcaoRequestDTO data) {
        Porcao porcaoData = new Porcao(data);
        return  porcaoRepository.save(porcaoData);
    }
}
