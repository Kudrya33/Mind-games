package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void startsTheGameEven() {
        String userName = Cli.greetsThePlayer();

        String rulesOfTheGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int countCorrectAnswer = 0;

        String correctAnswer = "";
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            if (countCorrectAnswer == -1) {
                break;
            }
            int evenNumber = random.nextInt(100);
            if (evenNumber%2 == 0) {
                correctAnswer = "yes";
            }
            if (evenNumber%2 != 0) {
                correctAnswer = "no";
            }
            String question = "Question: " + evenNumber;
            countCorrectAnswer = Engine.launchEngine(userName, rulesOfTheGame, question, correctAnswer, i, countCorrectAnswer);
        }
    }
}
