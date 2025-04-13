package org.example.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //PRUEBA 1
        int[] numero = new int[5];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=i;
        }

        //PRUEBA 2
        ArrayList<Persona> personaList = new ArrayList<>();
        Persona persona1 = new Persona("David", 7);
        Persona persona2 = new Persona("Sofia", 13);
        Persona persona3 = new Persona("Laura", 27);

        personaList.add(persona1);
        personaList.add(persona2);
        personaList.add(persona3);

        //PRUEBA 3
        LinkedList<Persona> listaPersonas = new LinkedList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(1, persona3);

        System.out.println(listaPersonas.peek());
        //offer, poll, peek | add, remove, element
    }
}
