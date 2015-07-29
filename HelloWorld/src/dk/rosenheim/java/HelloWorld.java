package dk.rosenheim.java;
import java.util.Scanner;
import java.lang.System;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("I CAN PRINT STUFF !");
        echo("I CAN ECHO STUFF!");

        Person pName = new Person("Patrick");
        Person pAge = new Person(99);
        System.out.println(pName.navn + " " + pAge.age);

        Hat hat = new Hat();
        System.out.println(hat.tekst);
        hat.hans(5);

        // I AM A COMMENT !
        // I AM A
        // LONGER COMMENT
        //
        // Typer
        // Int, String, Bool, Boolean, float, Array, DoubleS
        // Examples on variables

        int tal = 55;
        int tal2 = 33;
        int sum = tal + tal2;  // sum = tal(55) + tal2(33). sum = 88
        System.out.println(tal + " + " + tal2 + " = " + sum);

        int sumdouble = sumDouble(sum); //Lav int, value = result fra "sumDouble"
        echo("Doubled: " + sumdouble);  //Print that shit.
        int sumhalf = sumHalf(sum);     //Lav int, value = result fra "sumHalf"
        echo("Halfed: " + sumhalf);     //Print that shit.
        int sumSquared = squared(sum);
        echo("squared: " + sumSquared);
        int sumCubed = cubed(sum);
        echo("Cubed: " + sumCubed);

        // Priavte, local and global variables - Aka. Scope

        //
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
    }

    static int sumDouble(int i){
        int result = i * 2;
        return result;
    }
    static int sumHalf(int i){
        int result = i / 2;
        return result;
    }
    static int squared(int i){
        int result = i * i;
        return result;
    }
    static int cubed(int i){
        int result = (i * i) * i;
        return result;
    }
    static void echo(String S){
        System.out.println(S);
    }
}
