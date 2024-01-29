package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");

        Scanner scanNumberGame = new Scanner(System.in);
        String gameNumberSelection = scanNumberGame.nextLine();

        System.out.println("Your choice: " + gameNumberSelection);
        System.out.println("Welcome to the Brain Games!");

        switch (gameNumberSelection) {
            case "0":
                break;
            case "1":
                System.out.println("Welcome to the Brain Games!");
                break;
            case "2":
                Even.start();
                break;
            case "3":
                Calc.start();
                break;
            case "4":
                GCD.start();
                break;
            case "5":
                Progression.start();
                break;
            case "6":
                Prime.start();
                break;
            default:
                throw new Error("Unknown state!");
        }
    }
}
