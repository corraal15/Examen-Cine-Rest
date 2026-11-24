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
@Table(name="Actor")
public class Actor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nombre;

    @Column(nullable = false, length = 60)
    private String nacionalidad;

    @Column
    @OneToMany(mappedBy = "id")
    List<Reparto> repartos=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Reparto> getRepartos() {
        return repartos;
    }

    public void setRepartos(List<Reparto> repartos) {
        this.repartos = repartos;
    }

    @Override
    public String toString() {
        return "Actor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", repartos=" + repartos
                + "]";
    }

    public Actor() {
    }

    public Actor(Long id, String nombre, String nacionalidad, List<Reparto> repartos) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.repartos = repartos;
    } 
}
