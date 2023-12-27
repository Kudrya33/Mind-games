package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Progression {
    static final int INTERVAL = 100;
    static final int UNATTAINABLE_NUMBER = 999;
    static final int INTERVAL_CHOICE = 10;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int ARRAY_LENGTH = 10;
    public static void startsTheGameProgression() {
        String userName = Cli.greetsThePlayer();

        String rules = "What number is missing in the progression?";

        int countAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            if (countAnswer == -1) {
                break;
            }
            int[] numbers = new int[ARRAY_LENGTH];
            int startNumber = random.nextInt(INTERVAL);
            int countStep = random.nextInt(INTERVAL_CHOICE);
            int numberMissing = random.nextInt(INTERVAL_CHOICE);
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

            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = question;
            questionAndAnswer[1] = correctAnswerToString;

            countAnswer = Engine.upEngine(userName, rules, questionAndAnswer, i, countAnswer);
        }
    }
    public static int answerToQuestion(int[] numbers, int numberMissing) {
        return numbers[numberMissing];
    }
}
