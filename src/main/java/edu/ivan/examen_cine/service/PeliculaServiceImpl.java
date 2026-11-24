package edu.ivan.examen_cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ivan.examen_cine.model.dto.PeliculaDetalleDTO;
import edu.ivan.examen_cine.model.dto.PeliculaRequestDTO;
import edu.ivan.examen_cine.model.repository.PeliculaRepository;


@Service
public class PeliculaServiceImpl implements IPeliculaService{
@Autowired 
private PeliculaRepository peliculaRepo;

@Override
public PeliculaDetalleDTO crear(PeliculaRequestDTO dto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'crear'");
}

}


