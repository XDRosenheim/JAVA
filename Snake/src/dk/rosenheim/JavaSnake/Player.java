package dk.rosenheim.JavaSnake;

import java.util.Scanner;

public class Player {

    public static String main(){
        String playerName = null;
        int nameLenght = 0, nameLenghtMust = 4;
        while (nameLenght != nameLenghtMust){
            System.out.print("Enter your name: ");
            Scanner playerInput = new Scanner(System.in);
            playerName = playerInput.next().toUpperCase();
            if (playerName.length() == nameLenghtMust) {
                System.out.println("Welcome, " + playerName + ". Let's get started!");
                nameLenght = playerName.length();
            }
            else {
                System.out.println("Your name must be " + nameLenghtMust + " chars long.");
            }
        }
        return playerName;
    }
}
