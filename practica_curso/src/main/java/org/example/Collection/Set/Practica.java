package org.example.Collection.Set;

import java.util.HashSet;

public class Practica {
    public static void main(String[] args) {

        HashSet<Persona> personasSet = new HashSet<>();

        Persona persona1 = new Persona("David","Andres", 7);
        Persona persona2 = new Persona("Sofia", "Andres",7);
        Persona persona3 = new Persona("Laura", "Anton", 7);

        personasSet.add(persona1);
        personasSet.add(persona2);//no entra por el hasCode y el equals que se implementa en el Objeto.
        personasSet.add(persona3);

        System.out.println(personasSet);

    }
}
