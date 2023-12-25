package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    static final int INTERVAL = 100;
    static final int NUMBER_OF_ROUNDS = 3;
    public static void startsTheGamePrime() {
        String userName = Cli.greetsThePlayer();

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        int countAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            if (countAnswer == -1) {
                break;
            }
            int number = random.nextInt(INTERVAL);
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
            countAnswer = Engine.upEngine(userName, rules, question, correctAnswer, i, countAnswer);
        }
    }
}
