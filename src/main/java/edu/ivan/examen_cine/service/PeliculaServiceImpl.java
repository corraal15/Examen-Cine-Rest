package edu.ivan.examen_cine.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ivan.examen_cine.model.dto.PeliculaDetalleDTO;
import edu.ivan.examen_cine.model.dto.PeliculaListadoDTO;
import edu.ivan.examen_cine.model.dto.PeliculaRequestDTO;
import edu.ivan.examen_cine.model.dto.RepartoDTO;
import edu.ivan.examen_cine.model.entity.Pelicula;
import edu.ivan.examen_cine.repository.PeliculaRepository;
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
        Pelicula pelicula = new Pelicula(null, dto.titulo(), dto.director(),dto.anio(),dto.duracion(),null);
        Pelicula guardado = peliculaRepo.save(pelicula);
        return new PeliculaDetalleDTO(guardado.getId(), guardado.getTitulo(),guardado.getDirector(), guardado.getAnio(),guardado.getDuracion(), new ArrayList<RepartoDTO>());
    }

@Override
public PeliculaListadoDTO leertodas() {
    

    throw new UnsupportedOperationException("Unimplemented method 'leertodas'");
}
}





       

    