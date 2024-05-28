package com.aluracursos.desafio_screenmatch_frases.service;

import com.aluracursos.desafio_screenmatch_frases.dto.FraseDTO;
import com.aluracursos.desafio_screenmatch_frases.model.Frase;
import com.aluracursos.desafio_screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
