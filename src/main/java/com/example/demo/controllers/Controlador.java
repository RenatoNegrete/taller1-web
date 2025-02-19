package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.example.demo.modelo.Estudent;
import com.example.demo.service.EstudentService;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/plantillas")
public class Controlador {

    private final EstudentService estudentService;

    public Controlador(EstudentService estudentService) {
        this.estudentService = estudentService;
    }

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
        return new ModelAndView("descipcion_proyecto"); 
    }

    @GetMapping("/requirements")
    public ModelAndView requirementsModelAndView() {
        return new ModelAndView("requerimientos"); 
    }

    @GetMapping("/arquitectura")
    public ModelAndView arquitecturaModelAndView() {
        return new ModelAndView("arquitectura");
    }
    
    @GetMapping("/desarrollo")
    public ModelAndView desarrolloModelAndView() {
        return new ModelAndView("desarrollo");
    }

    @GetMapping("/pruebas")
    public ModelAndView pruebasModelAndView() {
        return new ModelAndView("pruebas");
    }

    @GetMapping("/despliegue")
    public ModelAndView despliegueModelAndView() {
        return new ModelAndView("despliegue");
    }



    @GetMapping("/contactenos")
    public ModelAndView contactenosModelAndView(Model model) {
    model.addAttribute("student", new Estudent()); 
    return new ModelAndView("Formulario");
}


    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("student", new com.example.demo.modelo.Estudent()); 
        return "Formulario";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(@ModelAttribute("student") Estudent student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Formulario";
        }
        estudentService.guardarEstudent(student);

        System.out.println("=== Datos Recibidos ===");
        System.out.println("Nombre: " + student.getNombres());
        System.out.println("Apellidos: " + student.getApellidos());
        System.out.println("Correo: " + student.getCorreo());
        System.out.println("Semestre: " + student.getSemestre());
        System.out.println("Descripción: " + student.getDescripcion());

        return "redirect:/plantillas/";
    }
}
