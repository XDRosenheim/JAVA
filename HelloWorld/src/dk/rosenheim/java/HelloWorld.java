package dk.rosenheim.java;

import java.util.Scanner;
import java.lang.System;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("I CAN PRINT STUFF !");
        echo("I CAN ECHO STUFF!");
        // I AM A COMMENT !
        /*
         * I AM A
         * LONGER COMMENT
         */

        // Typer
        /*
         * Int, String, Bool, Boolean, float, Array, Double
         */

        // Examples on variables

        int tal = 55;
        int tal2 = 33;
        int sum = tal + tal2;
        System.out.println(sum);

        // Priavte, local and global variables - Aka. Scope

        // TODO Parameter, pointer, constant/const
        // Parameter - Methods
        // const - Variable can't change.

        Scanner scanner = new Scanner(System.in);
        String myText = scanner.next();

        echo("Text: " + myText + " Adams.");
        scanner.close();

        int a = 10, b = 20;
        if (a == 10) echo("True!");
        if (b < 1000 && b > 10) echo("True!");

        // These two, does the same.
        // 1
        for (int i = 10; i > 5; i--) System.out.println(i);
        // 2
        for (int i = 10; i > 5; i--) {
            System.out.println(i);
        }

        int sumdouble = sumDouble(sum); //Lav int, value = result fra "sumDouble"
        System.out.println(sumdouble);         //Print that shit.

        int sumhalf = sumHalf(sum);     //Lav int, value = result fra "sumHalf"
        System.out.println(sumhalf);           //Print that shit.
    }

    public static int sumDouble(int i){
        int result = i * 2;
        return result;
    }

    static int sumHalf(int i){
        int result = i / 2;
        return result;
    }

    public static void echo(String S){
        out.println(S);
    }
}