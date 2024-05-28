package com.aluracursos.desafio_screenmatch_frases.dto;

import jakarta.persistence.Column;

public record FraseDTO(
        String titulo,
        String frase,
        String personaje,
        String poster) {
}
