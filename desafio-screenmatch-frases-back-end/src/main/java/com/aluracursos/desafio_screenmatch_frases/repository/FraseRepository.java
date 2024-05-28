package com.aluracursos.desafio_screenmatch_frases.repository;

import com.aluracursos.desafio_screenmatch_frases.dto.FraseDTO;
import com.aluracursos.desafio_screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY FUNCTION ('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
