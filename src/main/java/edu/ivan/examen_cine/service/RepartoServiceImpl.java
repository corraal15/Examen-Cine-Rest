package edu.ivan.examen_cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ivan.examen_cine.repository.RepartoRepository;

@Service
public class RepartoServiceImpl implements IRepartoService {
@Autowired 
private RepartoRepository repartoRepo;

}
