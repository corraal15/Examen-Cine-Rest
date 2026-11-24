package edu.ivan.examen_cine.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ivan.examen_cine.model.dto.PeliculaDetalleDTO;
import edu.ivan.examen_cine.model.dto.PeliculaRequestDTO;
import edu.ivan.examen_cine.model.dto.RepartoDTO;
import edu.ivan.examen_cine.model.entity.Pelicula;
import edu.ivan.examen_cine.model.repository.PeliculaRepository;
import jakarta.transaction.Transactional;


@Service
public class PeliculaServiceImpl implements IPeliculaService{
@Autowired 
private PeliculaRepository peliculaRepo;

@Override
@Transactional
public PeliculaDetalleDTO crear(PeliculaRequestDTO dto) {
    if (dto.titulo() == null || dto.titulo().isBlank()) {
            throw new IllegalArgumentException("El titulo de la pelicula no puede estar vacío");
        }
        Pelicula pelicula = new Pelicula(dto.titulo(), dto.director(),dto.anio(),dto.duracion());
        Pelicula guardado = peliculaRepo.save(pelicula);
        return new PeliculaDetalleDTO(guardado.getId(), guardado.getTitulo(), guardado.getAnio(),guardado.getDuracion() new ArrayList<RepartoDTO> reparto());
    }
}

}



       

    