package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    static final int INTERVAL = 100;
    public static void startsTheGameEven() {
        String userName = Cli.greetsThePlayer();

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int countAnswer = 0;

        String correctAnswer = "";

        Random random = new Random();
        int numberOfRounds = 3;

        for (int i = 0; i < numberOfRounds; i++) {
            if (countAnswer == -1) {
                break;
            }
            int evenNumber = random.nextInt(INTERVAL);
            if (evenNumber % 2 == 0) {
                correctAnswer = "yes";
            }
            if (evenNumber % 2 != 0) {
                correctAnswer = "no";
            }
            String question = "Question: " + evenNumber;
            countAnswer = Engine.upEngine(userName, rules, question, correctAnswer, i, countAnswer);
        }
    }
}
