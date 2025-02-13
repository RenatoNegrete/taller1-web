package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.example.Modelo.Estudent;
import com.example.demo.controllers.*;

@Controller
@RequestMapping("/plantillas")
public class Controlador {

    @GetMapping("/home")
    public ModelAndView archivoModelAndView() {
        return new ModelAndView("archivo");
    }

    @GetMapping("/team")
    public ModelAndView equipoModelAndView() {
        return new ModelAndView("equipo"); 
    }

    @GetMapping("/proyectdescription")
    public ModelAndView proyectDescriptionModelAndView() {
        return new ModelAndView("descripcion_proyecto"); 
    }

    @GetMapping("/requirements")
    public ModelAndView requirementsModelAndView() {
        return new ModelAndView("requerimientos"); 
    }

    @GetMapping("/contactenos")
    public ModelAndView contactenosModelAndView() {
        return new ModelAndView("formulario"); 
    }

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("student", new com.example.Modelo.Estudent()); 
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(@ModelAttribute Estudent student, BindingResult result, Model model) {
    if (result.hasErrors()) {
        return "formulario";
    }

    // Imprimir los datos en la consola
    System.out.println("=== Datos Recibidos ===");
    System.out.println("Nombre: " + student.getNombres());
    System.out.println("Apellidos: " + student.getApellidos());
    System.out.println("Correo: " + student.getCorreo());
    System.out.println("Semestre: " + student.getSemestre());
    System.out.println("Descripción: " + student.getDescripcion());

    return "redirect:/";
}
}
