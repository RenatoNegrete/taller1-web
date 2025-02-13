package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/plantillas") 
public class Controlador {

    @GetMapping("/home")
    public ModelAndView archivoModelAndView()
    {

        return new ModelAndView("archivo");

    }   

    @GetMapping("/team")
    public ModelAndView equipoModelAndView() {
        return new ModelAndView("equipo");
    }
    
    @GetMapping("/proyectdescription")
    public ModelAndView proyectDescriptionModelAndView() {
        return new ModelAndView("descipcion_proyecto");
    }
    
    @GetMapping("/requirements")
    public ModelAndView requirementsModelAndView() {
        return new ModelAndView("requerimientos");
    }
    
}
