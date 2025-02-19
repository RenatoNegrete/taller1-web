package com.example.demo.service;

import com.example.demo.modelo.Estudent;
import com.example.demo.repository.EstudentRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudentService {

    private final EstudentRepository estudentRepository;

    public EstudentService(EstudentRepository estudentRepository) {
        this.estudentRepository = estudentRepository;
    }

    public Estudent guardarEstudent(Estudent estudent) {
        return estudentRepository.save(estudent);
    }
}