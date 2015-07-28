package dk.rosenheim.JavaSnake;

import java.util.Scanner;

public class Config {
    public static Integer[] boardSize;
    public int boardColor;
    public static String playerName;

    static Scanner scanner = new Scanner(System.in);

    public static void main(){
        boolean stayInLoop = true;
        int selection;
        options.clearConsole();
        while (stayInLoop) {
            IHateLongCommands.echo("##  Options  ##");
            IHateLongCommands.echo("[1] Player name.");
            IHateLongCommands.echo("[2] Board Size.");
            IHateLongCommands.echo("[3] Board colour.");
            IHateLongCommands.echo("[4] Player colour.");
            IHateLongCommands.echo("[0] Back.");
            IHateLongCommands.echo("");
            IHateLongCommands.echo("Selection: ");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    playerName = Player.main();
                    break;
                case 2:
                    //Config.size(); //TODO Make "size" in Config class
                    break;
                case 3:
                    //Config.colour(); //TODO Make "bColour" in Config class
                    break;
                case 4:
                    //Player.colour(); //TODO Make "colour" in player class
                    break;
                case 0:
                    stayInLoop = false;
                    break;
                default:
                    break;
            }
        }
    }
    static void size(){
        boardSize[0] = scanner.nextInt();
        if (boardSize[0] < 10) {

        }
        boardSize[1] = scanner.nextInt();
    }
}
