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
    @OneToMany(mappedBy = "id", orphanRemoval = true)
    List<Reparto> repartos=new ArrayList<>();   
    
    public static void addReparto(Reparto reparto){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Reparto> getRepartos() {
        return repartos;
    }

    public void setRepartos(List<Reparto> repartos) {
        this.repartos = repartos;
    }

    @Override
    public String toString() {
        return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", anio=" + anio + ", duracion="
                + duracion + ", repartos=" + repartos + "]";
    }

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, String director, int anio, int duracion, List<Reparto> repartos) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
        this.repartos = repartos;
    }
}
