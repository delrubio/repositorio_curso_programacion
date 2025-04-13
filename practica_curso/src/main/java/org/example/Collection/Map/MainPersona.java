package org.example.Collection.Map;

import java.util.*;

public class MainPersona {

    public static Map<Persona, Integer> personaMap = new HashMap<>();

    public static void main(String[] args) {

        List<Persona> listaPersonas = new ArrayList<>();

        Persona persona1 = new Persona("David","Andres", 15);
        Persona persona2 = new Persona("Sofia", "Andres",18);
        Persona persona3 = new Persona("Laura", "Anton", 14);
        Persona persona4 = new Persona("Javi", "Ajda", 21);
        Persona persona5 = new Persona("Maria", "Sanchez", 17);
        Persona persona6 = new Persona("Paula", "Rivas", 19);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);

        for (int i = 0; i < listaPersonas.size(); i++) {
            recuentoVeces(listaPersonas.get(i));
        }

        System.out.println(listaPersonas);

        imprimirRecuento();

    }

    public static void comprobarPersonas(){



    }

    public static void recuentoVeces(Persona persona){
        personaMap.put(persona, personaMap.getOrDefault(persona, 0)+ 1);
    }

    public static void imprimirRecuento(){
        for (Map.Entry<Persona, Integer> mapita : personaMap.entrySet()){
            System.out.println(mapita.getKey().getNombre() + " ha entrado al GYM un total de " + mapita.getValue() + (mapita.getValue()==1? " vez" : " veces."));
        }
    }
}
