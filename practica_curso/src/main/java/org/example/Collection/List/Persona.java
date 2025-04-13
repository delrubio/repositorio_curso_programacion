package org.example.Collection.List;

import lombok.Data;

@Data
public class Persona {

    private String Nombre;
    private int Edad;

    public Persona(String nombre, int edad){
        this.Nombre=nombre;
        this.Edad=edad;
    }
}
