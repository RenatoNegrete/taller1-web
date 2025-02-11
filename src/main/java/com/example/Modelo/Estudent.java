package com.example.Modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Estudent {
    @Id


    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Semestre;
    private String Descripcion;

}

