package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void startsTheGamePrime() {
        String userName = Cli.greetsThePlayer();

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        int countAnswer = 0;

        Random random = new Random();
        int numberOfRounds = 3;

        for (int i = 0; i < numberOfRounds; i++) {
            if (countAnswer == -1) {
                break;
            }
            int number = random.nextInt(100);
            String correctAnswer = "";
            if (number < 2) {
                correctAnswer = "no";
            }
            if (number >= 2) {
                for (int j = 2; j <= number / 2; j++) {
                    if (number % j == 0) {
                        correctAnswer = "no";
                        break;
                    } else {
                        correctAnswer = "yes";
                    }
                }
            }
            String question = "Question: " + number;
            countAnswer = Engine.launchEngine(userName, rules, question, correctAnswer, i, countAnswer);
        }
    }
}
