package com.example.demo.controllers;

import com.example.demo.modelo.Estudent;
import com.example.demo.service.EstudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudents")
public class EstudentController {

    private final EstudentService estudentService;

    public EstudentController(EstudentService estudentService) {
        this.estudentService = estudentService;
    }

    @PostMapping("/guardar")
    public Estudent guardarEstudent(@RequestBody Estudent estudent) {
        return estudentService.guardarEstudent(estudent);
    }

}
