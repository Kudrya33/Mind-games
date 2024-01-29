package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int NUMBER_OF_ROUNDS = 3;
    static final int MAX_VALUE = 100;
    public static void start() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[NUMBER_OF_ROUNDS];
        String[] answers = new String[NUMBER_OF_ROUNDS];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int evenNumber = Utils.getRandomInt(0, MAX_VALUE);

            String correctAnswer = answerToQuestion(evenNumber) ? "Yes" : "No";
            String question = "Question: " + evenNumber;

            questions[i] = question;
            answers[i] = correctAnswer;
        }
        Engine.upEngine(rules, questions, answers);
    }
    public static boolean answerToQuestion(int evenNumber) {
        return evenNumber % 2 == 0;
    }
}
