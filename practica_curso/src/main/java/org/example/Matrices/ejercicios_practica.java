package org.example.matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicios_practica {

    static Scanner teclado = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
//        for (int i = 0; i < 30; i++) {
//            System.out.print(random.nextInt(6)+1);
//        }

        tablaEstudiantes();

    }

    //COSAS
    public static void cosas(){
        int matriz[][] = new int[3][3];

        //imprimir forma 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        //imprimir forma 2
        for (int[] linea : matriz) {
            for (int columna : linea) {

                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }

        //rellenar con random
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
            }
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

    //EJERCICIO 2
    public static void ejercicio2(){

        int[][] matriz = new int[random.nextInt(5)+1][random.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
            }
        }

        for (int[] linea : matriz) {

            for (int columna : linea) {

                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }

        int sum =  0;
        System.out.println("Suma de filas: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sum);
            sum=0;

        }

//        int sum2 =  0;
//        System.out.println("Suma de columnas: ");
//        for (int i = 0; i < matriz[i].length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                sum2 += matriz[i][j];
//                System.out.println("Columna " + j + ": " + sum2);
//            }
//            sum2 = 0;
//
//        }



    }

    //EJERCICIO 3
    public static void tablaEstudiantes(){
        int estudiantes;
        int asignaturas;

        ArrayList<String> asignaturasList = new ArrayList<>();
        ArrayList<String> estudiantesList = new ArrayList<>();


        System.out.println("Cuantos estudiantes hay?");
        estudiantes=teclado.nextInt();

        System.out.println("Dime los nombres: ");
        for (int i = 0; i < estudiantes; i++) {
            estudiantesList.add(teclado.next());
        }

        System.out.println("Cuantas asignaturas tienes?");
        asignaturas=teclado.nextInt();

        System.out.println("Dime los nombres: ");
        for (int i = 0; i < asignaturas; i++) {
            asignaturasList.add(teclado.next());
        }

        String[][] matriz = new String[estudiantes+1][asignaturas+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i==0 && j==0){
                    matriz[i][j] = "   ";
                    matriz[0][j + 1] = asignaturasList.get(j);
                    j = 1;
                }

                if (j < asignaturasList.size()) {
                    matriz[0][j + 1] = asignaturasList.get(j);
                }
            }
            if (i < estudiantesList.size()){
                matriz[i + 1][0] = estudiantesList.get(i);
            }
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.println("Dime la nota de " + matriz[i][0] + " en " + matriz[0][j] );
                matriz[i][j] = teclado.next();
            }
        }

        for (String[] filas : matriz){
            for (String columna : filas){
                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }

        for (int i = 1; i < matriz.length; i++) {
            int media = 0;
            for (int j = 1; j < matriz[i].length; j++) {
                media += Integer.parseInt(matriz[i][j]);
            }

            System.out.println("La media de " + matriz[0][i] + " es " + media/asignaturas);

        }

    }


}
