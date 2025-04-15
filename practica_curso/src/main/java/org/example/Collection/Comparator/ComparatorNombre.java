package org.example.Collection.Comparator;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Profesor> {
    @Override
    public int compare(Profesor o1, Profesor o2) {

        int comparaApellidos = o1.getApellido().compareTo(o2.getApellido());
        //primero quiero ordenar por apellidos

        if (comparaApellidos != 0){
            return comparaApellidos;
        }

        return o1.getNombre().compareTo(o2.getNombre());
        //si los apellidos son iguales, pasamos a ordenar por nombre.
    }
}
