package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    static final int UNATTAINABLE_NUMBER = 999;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 10;
    public static void startsTheGameProgression() {
        String rules = "What number is missing in the progression?";
        String[] questions = Utils.getArray(3);
        String[] answers = Utils.getArray(3);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int[] numbers = new int[ARRAY_LENGTH];
            int startNumber = Utils.getRandomInt(0, 100);
            int countStep = Utils.getRandomInt(10);
            int numberMissing = Utils.getRandomInt(10);
            numbers[0] = startNumber;
            for (int j = 1; j < numbers.length; j++) {
                numbers[j] = startNumber + countStep;
                startNumber = numbers[j];
            }
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
