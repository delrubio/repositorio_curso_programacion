package org.example.Collection.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Profesor implements Comparable<Profesor>{

    private String nombre;
    private String apellido;
    private int edad;
    private int curso;

    @Override
    public int compareTo(Profesor o) {

        int comparaApellidos = this.apellido.compareTo(o.getApellido());
        //primero quiero ordenar por apellidos

        if (comparaApellidos != 0){
            return comparaApellidos;
        }

        return this.nombre.compareTo(o.getNombre());
        //si los apellidos son iguales, pasamos a ordenar por nombre.
    }
}
