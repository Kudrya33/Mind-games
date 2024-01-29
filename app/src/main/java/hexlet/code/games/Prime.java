package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int NUMBER_OF_ROUNDS = 3;
    static final int MAX_VALUE = 100;
    public static void start() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[NUMBER_OF_ROUNDS];
        String[] answers = new String[NUMBER_OF_ROUNDS];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(0, MAX_VALUE);

            String correctAnswer = answerToQuestion(number) ? "Yes" : "No";
            String question = "Question: " + number;

            questions[i] = question;
            answers[i] = correctAnswer;
        }
        Engine.upEngine(rules, questions, answers);
    }
    public static boolean answerToQuestion(int number) {
        boolean answer = number >= 2;
        if (number >= 2) {
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}
