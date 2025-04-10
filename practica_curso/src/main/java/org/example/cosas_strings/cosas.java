package org.example.cosas_strings;

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


}
