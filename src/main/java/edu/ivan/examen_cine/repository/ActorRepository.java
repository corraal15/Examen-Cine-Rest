package edu.ivan.examen_cine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ivan.examen_cine.model.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{}
