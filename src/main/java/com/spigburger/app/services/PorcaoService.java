package com.spigburger.app.services;

import com.spigburger.app.dto.PorcaoDTO;
import com.spigburger.app.dto.PorcaoMinDTO;
import com.spigburger.app.entities.Porcao;
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
}
