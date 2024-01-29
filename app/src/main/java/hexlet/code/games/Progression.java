package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    static final int UNATTAINABLE_NUMBER = 999;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 10;
    static final int MAX_VALUE = 100;
    public static void start() {
        String rules = "What number is missing in the progression?";
        String[] questions = new String[NUMBER_OF_ROUNDS];
        String[] answers = new String[NUMBER_OF_ROUNDS];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            var numbers = Utils.progressionGeneration(ARRAY_LENGTH, MAX_VALUE);
            int numberMissing = Utils.getRandomInt(ARRAY_LENGTH);

            int correctAnswer = answerToQuestion(numbers, numberMissing);
            String correctAnswerToString = Integer.toString(correctAnswer);

            numbers[numberMissing] = UNATTAINABLE_NUMBER;

            String processedString = Arrays.toString(numbers);
            processedString = processedString.replace("[", "").replace("]", "").replace(",", "").replace("999", "..");

            String question = "Question: " + processedString;

            questions[i] = question;
            answers[i] = correctAnswerToString;
        }
        Engine.upEngine(rules, questions, answers);
    }
    public static int answerToQuestion(int[] numbers, int numberMissing) {
        return numbers[numberMissing];
    }
}
