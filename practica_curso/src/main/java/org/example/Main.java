package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10,40));

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero ");
        int num = 0;

        try {
            num = teclado.nextInt();
        }catch (InputMismatchException e1){
            System.out.println("ERROR");
        }

        System.out.println(num);

    }
}