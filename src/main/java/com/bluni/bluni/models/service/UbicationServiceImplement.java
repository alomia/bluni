package com.bluni.bluni.models.service;

import com.bluni.bluni.models.entity.Ubication;
import com.bluni.bluni.models.repository.UbicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicationServiceImplement implements IUbicationService {
    @Autowired
    private UbicationRepository ubicationRepository;

    @Override
    public List<Ubication> ListaUbicaciones() {
        return ubicationRepository.findAll();
    }
}
