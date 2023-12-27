package hexlet.code.games;

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

            String correctAnswer = answerToQuestion(number);

            String question = "Question: " + number;

            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = question;
            questionAndAnswer[1] = correctAnswer;

            countAnswer = Engine.upEngine(userName, rules, questionAndAnswer, i, countAnswer);
        }
    }
    public static String answerToQuestion(int number) {
        String answer = "";
        if (number < 2) {
            answer = "no";
        }
        if (number >= 2) {
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }
        }
        return answer;
    }
}
