package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/plantillas") 
public class Controlador {

    @GetMapping("/plantillas")
    public ModelAndView archivoModelAndView()
    {

        return new ModelAndView("/archivo");

    }   
}
