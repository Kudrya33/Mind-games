package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int NUMBER_OF_ROUNDS = 3;
    public static void startsTheGamePrime() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = Utils.getArray(3);
        String[] answers = Utils.getArray(3);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(0, 100);

            String correctAnswer = answerToQuestion(number);

            String question = "Question: " + number;

            questions[i] = question;
            answers[i] = correctAnswer;
        }
        Engine.upEngine(rules, questions, answers);
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
