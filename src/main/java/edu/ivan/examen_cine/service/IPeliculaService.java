package edu.ivan.examen_cine.service;

import edu.ivan.examen_cine.model.dto.PeliculaDetalleDTO;
import edu.ivan.examen_cine.model.dto.PeliculaRequestDTO;

public interface IPeliculaService {
    PeliculaDetalleDTO crear(PeliculaRequestDTO dto);
}
