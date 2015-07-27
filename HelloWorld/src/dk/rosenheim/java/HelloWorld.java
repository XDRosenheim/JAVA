package dk.rosenheim.java;

import java.util.Scanner;
import java.lang.System;

public class HelloWorld {

	public static void main(String[] args) {
        System.out.println("I CAN PRINT STUFF !");

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

        int tal, tal2, sum;
        tal = 55;
        tal2 = 33;
        sum = tal + tal2;
        System.out.println(sum);

        // Priavte, local and global variables - Aka. Scope

        // TODO Parameter, pointer, constant/const
        // Parameter - Methods
        // const - Variable can't change.

        Scanner scanner = new Scanner(System.in);
        String myText = scanner.next();

        System.out.println("Text: " + myText + " Adams.");
        scanner.close();

        int a = 10, b = 20, c = 30;
        if (a == 10) {
            System.out.println("True!");
        }

        if (b < 1000 && b > 10) {
            System.out.println("True!");
        }

        for (int i = 10; i > 5; i--) {
            System.out.println(i);
        }
    }
}