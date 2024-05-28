package com.aluracursos.desafio_screenmatch_frases.controller;

import com.aluracursos.desafio_screenmatch_frases.dto.FraseDTO;
import com.aluracursos.desafio_screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {
    @Autowired
    private FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
