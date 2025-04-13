package org.example.Collection.Iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Indices {

    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(1,5,16,87,23,17,34));

        ListIterator<Integer> itEdades = edades.listIterator();

        System.out.println("Lista hacia adelante: ");
        while (itEdades.hasNext()){
            System.out.println(itEdades.next());
        }

        System.out.println("Lista del revés: ");
        while (itEdades.hasPrevious()){
            System.out.println(itEdades.previous());
        }

        //MODIFICAR LA LISTA HACIA DETRÁS
        ListIterator<Integer> itEdades2 = edades.listIterator(edades.size());
        System.out.println("Hacia detrás desde inicio");

        while (itEdades2.hasPrevious()){

            if (itEdades2.previous() < 18) {
                itEdades2.set(100);
                System.out.println(itEdades2.previousIndex());
            }

        }System.out.println(edades);

    }

}
