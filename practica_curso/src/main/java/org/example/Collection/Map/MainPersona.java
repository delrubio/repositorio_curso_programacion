package org.example.Collection.Map;

import org.example.Collection.ExamenEstructuras.Excursion.Estudiante;

import java.util.*;

public class MainPersona {

    public static Map<Persona, Integer> personaMap = new HashMap<>();
    public static List<Persona> listaPersonas = new ArrayList<>();

    public static void main(String[] args){

        Persona persona1 = new Persona("David","Andres", 15);
        Persona persona2 = new Persona("Sofia", "Andres",18);
        Persona persona3 = new Persona("Laura", "Anton", 14);
        Persona persona4 = new Persona("Javi", "Ajda", 21);
        Persona persona5 = new Persona("Maria", "Sanchez", 17);
        Persona persona6 = new Persona("Paula", "Rivas", 19);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona2);listaPersonas.add(persona2);listaPersonas.add(persona2);
        listaPersonas.add(persona3);listaPersonas.add(persona3);
        listaPersonas.add(persona4);listaPersonas.add(persona4);
        listaPersonas.add(persona5);listaPersonas.add(persona5);listaPersonas.add(persona5);listaPersonas.add(persona5);listaPersonas.add(persona5);
        listaPersonas.add(persona6);listaPersonas.add(persona6);listaPersonas.add(persona6);listaPersonas.add(persona6);

        for (int i = 0; i < listaPersonas.size(); i++) {
            recuentoVeces(listaPersonas.get(i));
        }

//        System.out.println(listaPersonas);
//        imprimirRecuento();

        System.out.println(listaPersonas);
        comprobarPersonas(18);
        System.out.println(listaPersonas);

    }

    public static void comprobarPersonas(int edad){
        Iterator<Persona> it = listaPersonas.iterator();

        while(it.hasNext()){
            Persona persona = it.next();
            if (persona.getEdad()<edad) {
                it.remove();
            }
        }
    }

    public static void recuentoVeces(Persona persona){
        personaMap.put(persona, personaMap.getOrDefault(persona, 0)+ 1);
    }

    //no funciona el iterator porque no se lo he hecho.
//    public static void imprimirRecuento(){
//        Iterator<Map.Entry<Persona, Integer>> mapitaIt = personaMap.entrySet().iterator();
//         ASI SE HACE EL ITERATOR DE UN MAPA.
//
//        for (Map.Entry<Persona, Integer> mapita : personaMap.entrySet()){
//            System.out.println(mapita.getKey().getNombre() + " con " + mapita.getKey().getEdad() + " años, ha entrado al GYM un total de " + mapita.getValue() + (mapita.getValue()==1? " vez" : " veces."));
//        }
//    }
}
