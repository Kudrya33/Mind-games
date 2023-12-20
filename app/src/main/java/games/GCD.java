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
        int numberOfRounds = 3;
        int number1;
        int number2;

        for (int i = 0; i < numberOfRounds; i++) {

            int correctAnswer = 1;

            if (countCorrectAnswer == -1) {
                break;
            }
            number1 = random.nextInt(100);
            number2 = random.nextInt(100);
            int numberOne = number1;
            int numberTwo = number2;

            while (numberTwo != 0) {
                int remainder = numberOne % numberTwo;
                correctAnswer = numberTwo;
                numberOne = numberTwo;
                numberTwo = remainder;
            }

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + number1 + " " + number2;
            countCorrectAnswer = Engine.launchEngine(userName, rulesOfTheGame, question, correctAnswerToString, i, countCorrectAnswer);
        }
    }
}
