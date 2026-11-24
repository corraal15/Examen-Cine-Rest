package edu.ivan.examen_cine.service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class PeliculaController {
    @PostMapping("/api/peliculas")
    public String crearPelicula(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }

    @GetMapping("/api/peliculas")
    public String leerPelicula(@RequestParam String param) {
        return new String();
    }
    @GetMapping("/api/peliculas/{id}")
    public String peliculaDetalles(@RequestParam String param) {
        return new String();
    }
    @PutMapping("/api/peliculas/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
       
    
}
