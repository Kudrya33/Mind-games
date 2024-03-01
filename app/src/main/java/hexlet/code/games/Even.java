package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int MAX_VALUE = 100;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int evenNumber = Utils.getRandomInt(0, MAX_VALUE);

            String correctAnswer = isEven(evenNumber) ? "Yes" : "No";
            String question = "Question: " + evenNumber;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.startTheEngine(RULES, questionsAndAnswers);

    }

    public static boolean isEven(int evenNumber) {
        return evenNumber % 2 == 0;
    }

}
