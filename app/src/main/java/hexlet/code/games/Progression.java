package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int ARRAY_LENGTH = 10;
    public static final int MAX_VALUE = 100;
    public static final String RULES = "What number is missing in the progression?";

    public static void start() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int startNumber = Utils.getRandomInt(0, MAX_VALUE);
            int countStep = Utils.getRandomInt(ARRAY_LENGTH);

            var numbers = generateProgression(ARRAY_LENGTH, startNumber, countStep);
            int numberMissing = Utils.getRandomInt(ARRAY_LENGTH);

            String correctAnswer = numbers[numberMissing];
            numbers[numberMissing] = "..";

            String processedString = Arrays.toString(numbers);

            processedString = processedString.replace("[", "").replace("]", "").replace(",", "");

            String question = "Question: " + processedString;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.startTheEngine(RULES, questionsAndAnswers);

    }

    public static String[] generateProgression(int arrayLength, int startNumber, int countStep) {
        int[] numbers = new int[arrayLength];
        String[] numbersArr = new String[arrayLength];
        numbers[0] = startNumber;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = startNumber + countStep;
            numbersArr[i] = "" + numbers[i];
            startNumber = numbers[i];
        }
        return numbersArr;
    }

}
