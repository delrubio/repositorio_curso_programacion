package org.example.Collection.Comparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Paco", "Martinez", 45, 2);
        Profesor profesor1 = new Profesor("Alba", "Fernandez", 25, 6);
        Profesor profesor2 = new Profesor("Alejandro", "Cortes", 29, 1);
        Profesor profesor3 = new Profesor("Paco", "Martinez", 45, 7);

        List<Profesor> profesorList = new ArrayList<>(Arrays.asList(profesor, profesor1, profesor2, profesor3));
        System.out.println(profesorList);

//        Collections.sort(profesorList);
//        System.out.println(profesorList);
//
//        Collections.sort(profesorList, Collections.reverseOrder());
//        System.out.println(profesorList);

        Collections.sort(profesorList, new ComparatorNombre());
        System.out.println(profesorList);

        //LA DIFERENCIA ENTRE EL COMPARATOR Y COMPARABLE, es que con el comparable solo hace falta escribirlo en la
        // clase y ya podemos hacer un Collections.sort a la lista de esos objetos como:
        //          Collections.sort(profesorList);
        // Comparator es lo mismo, pero
        // en una clase aparte y hay que decirle los 2 objetos y el tipo de ordenacion que queremos  usar como :
        //          Collections.sort(profesorList, new ComparatorNombre());

    }

}
