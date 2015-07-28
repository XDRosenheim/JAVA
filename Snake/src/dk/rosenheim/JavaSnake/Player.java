package dk.rosenheim.JavaSnake;

import java.util.Scanner;

/**
 * Created by HVF-E308 on 28-07-2015.
 */
public class Player {

    public static String playerName;
    public static int lives, score;

    public static void main(String[] args){

        if (playerName == null) {
            int nameLenght = 0;
            while (nameLenght != 4){
                System.out.print("Enter your name: ");
                Scanner playerInput = new Scanner(System.in);
                playerName = playerInput.next().toUpperCase();
                if (playerName.length() == 4) {
                    System.out.println("Welcome, " + playerName + ". Let's get started!");
                    nameLenght = playerName.length();
                }
                else {
                    System.out.println("Your name must be 3 chars long.");
                }
            }
        }
    }
}
