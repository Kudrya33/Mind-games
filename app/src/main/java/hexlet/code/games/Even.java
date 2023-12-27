package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    static final int INTERVAL = 100;
    static final int NUMBER_OF_ROUNDS = 3;
    public static void startsTheGameEven() {
        String userName = Cli.greetsThePlayer();

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int countAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            if (countAnswer == -1) {
                break;
            }
            int evenNumber = random.nextInt(INTERVAL);

            String correctAnswer = answerToQuestion(evenNumber);

            String question = "Question: " + evenNumber;

            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = question;
            questionAndAnswer[1] = correctAnswer;

            countAnswer = Engine.upEngine(userName, rules, questionAndAnswer, i, countAnswer);
        }
    }
    public static String answerToQuestion(int evenNumber) {
        return evenNumber % 2 == 0 ? "yes" : "no";
    }
}
