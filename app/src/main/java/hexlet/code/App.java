package hexlet.code;

import games.Calc;
import games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");

        Scanner scanNumberGame = new Scanner(System.in);
        int gameNumberSelection = scanNumberGame.nextInt();

        System.out.println("Your choice: " + gameNumberSelection);
        System.out.println("Welcome to the Brain Games!");

        switch (gameNumberSelection) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetsThePlayer();
            case 2:
                Even.startsTheGameEven();
                break;
            case 3:
                Calc.startsTheGameCalc();
                break;
            default:
                break;
        }
    }
}
