package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void startsTheGameGCD() {
        String userName = Cli.greetsThePlayer();

        String rulesOfTheGame = "Find the greatest common divisor of given numbers.";

        int countCorrectAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            int correctAnswer = 1;

            if (countCorrectAnswer == -1) {
                break;
            }
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int a = number1;
            int b = number2;

            while (b !=0) {
                int tmp = a % b;
                correctAnswer = b;
                a = b;
                b = tmp;
            }

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + number1 + " " + number2;
            countCorrectAnswer = Engine.launchEngine(userName, rulesOfTheGame, question, correctAnswerToString, i, countCorrectAnswer);
        }
    }
}
