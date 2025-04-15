package org.example.Cosas;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class cosas {

    //PASAR DE UNA CADENA STRING A INTEGER

    String cadena = "1";
    int numero = Integer.parseInt(cadena);

    String[] cadena2 = {"1"};
    int numero2 = Integer.parseInt(cadena2[1]);


    //PASAR DE UNA CADENA STRING A UN VECTOR/CHARACTER

    String texto = "Hola como estas";
    String [] cadena3 = texto.split(" ");

    String texto2 = "Hola";
    char cadena4 = texto2.charAt(1);


//    //todo le que utilize este metodo no lo va a poder modificar la lista.
//    public List<String> getListaArbi(){
//        return Collections.unmodifiableList(listaArbi);
//    }

    //RANDOM
//    Random random = new Random();
//    System.out.println(random.nextInt(10,40)); del 10 al 40.


    //asList()
//    Scanner teclado  = new Scanner(System.in);
//    String colores[] = {"azul","rojo","amarillo","verde","negro"};
//    System.out.println("Introduce un color: ");
//    String color = teclado.next();
//    boolean color_encontrado = Arrays.asList(colores).contains(color);
//
//    //ORDENACIÓN DE ARRAYS Y ELIMINAR DUPLICADOS
//    int [] array = {4,6,2,8,7};
//    Arrays.sort(array);
//
//    Integer [] array = {4,6,2,8,7};
//    Arrays.sort(array, Collections.reverseOrder());
//
//    int vector[] = {3,3,7,8,8,9,10,15,15};
//    int vector2[] = Arrays.stream(vector).distinct().toArray();
//    System.out.println(Arrays.toString(vector));
//    System.out.println(Arrays.toString(vector2));



}
