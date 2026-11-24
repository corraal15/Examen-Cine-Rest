package edu.ivan.examen_cine.model.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name="Pelicula")
public class Pelicula {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable= false,unique = true, length = 150)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String director;

    @Column
    private int anio;

    @Column(nullable = false, length = 100)
    private int duracion;

    @Column
    @OneToMany(mappedBy = "reparto")
    List<Reparto> repartos=new ArrayList<>();    
}
