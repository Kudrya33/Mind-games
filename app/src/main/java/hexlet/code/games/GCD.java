package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int NUMBER_OF_ROUNDS = 3;
    public static void startsTheGameGCD() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[] questions = Utils.getArray(3);
        String[] answers = Utils.getArray(3);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number1 = Utils.getRandomInt(0, 100);
            int number2 = Utils.getRandomInt(0, 100);

            int correctAnswer = answerToQuestion(number1, number2);

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + number1 + " " + number2;

            questions[i] = question;
            answers[i] = correctAnswerToString;
        }
        Engine.upEngine(rules, questions, answers);
    }
    public static int answerToQuestion(int number1, int number2) {
        int answer = 1;
        int numberOne = number1;
        int numberTwo = number2;
        while (numberTwo != 0) {
            int remainder = numberOne % numberTwo;
            answer = numberTwo;
            numberOne = numberTwo;
            numberTwo = remainder;
        }
        if (number2 == 0) {
            answer = number1;
        }
        return answer;
    }
}
