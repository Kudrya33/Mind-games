package hexlet.code;

import games.Calc;
import games.Even;
import games.GCD;
import games.Prime;
import games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");

        Scanner scanNumberGame = new Scanner(System.in);
        int gameNumberSelection = scanNumberGame.nextInt();

        System.out.println("Your choice: " + gameNumberSelection);
        System.out.println("Welcome to the Brain Games!");

        switch (gameNumberSelection) {
            case 0:
                break;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetsThePlayer();
                break;
            case 2:
                Even.startsTheGameEven();
                break;
            case 3:
                Calc.startsTheGameCalc();
                break;
            case 4:
                GCD.startsTheGameGCD();
                break;
            case 5:
                Progression.startsTheGameProgression();
                break;
            case 6:
                Prime.startsTheGamePrime();
                break;
            default:
        }
    }
}
