package com.spigburger.app.services;

import com.spigburger.app.dto.LancheDTO;
import com.spigburger.app.entities.Lanche;
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
        return new LancheDTO(lancheRepository.findById(id).get());
    }

}
