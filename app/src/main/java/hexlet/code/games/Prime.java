package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int MAX_VALUE = 100;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(0, MAX_VALUE);

            String correctAnswer = isPrime(number) ? "Yes" : "No";
            String question = "Question: " + number;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.startTheEngine(RULES, questionsAndAnswers);

    }
    public static boolean isPrime(int number) {
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
