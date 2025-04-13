package org.example.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una palabra: ");
        String palabras = teclado.next();

        Map<Character, Integer> mapaPalabras = new HashMap<>();

        //ejemplo 1
        for (Character letra : palabras.toCharArray()){
            mapaPalabras.put(letra, mapaPalabras.getOrDefault(letra, 0) +1);
            //coge la clave, y si luego buscando la clave no la encuentra, la pone a 0, si no le suma +1
        }

        for (Map.Entry<Character, Integer> letra : mapaPalabras.entrySet()){
            System.out.println(letra.getKey() + " = " + letra.getValue());
        }

    }

}
