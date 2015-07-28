package dk.rosenheim.JavaSnake;

import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args){
        while (true){
            int selection = 0;
            IHateLongCommands.echo("##   Snake   ##");
            IHateLongCommands.echo("[1] Start game.");
            IHateLongCommands.echo("[2] Options.");
            IHateLongCommands.echo("[3] Exit.");
            IHateLongCommands.echo("");
            IHateLongCommands.echo("Selection: ");
            int scanner = Scanner.next();
        }
    }
}
