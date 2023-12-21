package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final int NUMBER_OF_ROUNDS = 3;
    static final int INTERVAL = 100;
    public static void startsTheGameGCD() {
        String userName = Cli.greetsThePlayer();

        String rules = "Find the greatest common divisor of given numbers.";

        int countAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            int correctAnswer = 1;

            if (countAnswer == -1) {
                break;
            }
            int number1 = random.nextInt(INTERVAL);
            int number2 = random.nextInt(INTERVAL);
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
            countAnswer = Engine.upEngine(userName, rules, question, correctAnswerToString, i, countAnswer);
        }
    }
}
