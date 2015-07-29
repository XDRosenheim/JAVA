package dk.rosenheim.JavaSnake;

import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args){
        while (true){
            options.clearConsole();
            int selection;
            IHateLongCommands.echo("##   Snake   ##");
            IHateLongCommands.echo("[1] Start game.");
            IHateLongCommands.echo("[2] Options.");
            IHateLongCommands.echo("[0] Exit.");
            IHateLongCommands.echo("");
            IHateLongCommands.echo("Selection: ");
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();

            switch (selection){
                case 1:
                    // TODO Run game!
                    break;
                case 2:
                    Config.main();
                    break;
                case 3:
                    System.exit(0); //Kill game
                    break;
                default:
                    break;
            }
        }
    }
}
