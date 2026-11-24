package edu.ivan.examen_cine.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ivan.examen_cine.model.entity.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{}

