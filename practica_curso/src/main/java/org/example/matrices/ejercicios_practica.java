package org.example.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicios_practica {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
    }

    //COSAS
    public static void cosas(){
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    //EJERCICIO 1
    public static void ejercicio1(){

        //pedir matriz, enseñarla y buscar valor en la matriz.

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime: ");
                matriz[i][j] = teclado.nextInt();
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Que quieres buscar?");
        int numero = teclado.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if(matriz[i][j] == numero){
                    System.out.println("Tu número está en la posición " + i + ", " + j);
                }
            }
            System.out.println(" ");
        }
    }

}
