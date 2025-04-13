package org.example.Collection.Set;

import lombok.Data;

import java.util.Objects;

@Data
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, edad);
    }

}
