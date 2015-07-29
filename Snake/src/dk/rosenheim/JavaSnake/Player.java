package dk.rosenheim.JavaSnake;

import java.util.Scanner;

public class Player {

    public static String color;
    public static String name;

    public static void main(){
        int nameLenght = 0, nameLenghtMust = 4;
        while (nameLenght != nameLenghtMust) {
            System.out.print("Enter your name: ");
            Scanner playerInput = new Scanner(System.in);
            name = playerInput.next().toUpperCase();
            if (name.length() == nameLenghtMust) {
                System.out.println("Welcome, " + name + ". Let's get started!");
                nameLenght = name.length();
            } else {
                System.out.println("Your name must be " + nameLenghtMust + " chars long.");
            }
        }
    }
}
