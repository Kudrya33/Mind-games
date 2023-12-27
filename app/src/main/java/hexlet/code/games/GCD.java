package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final int NUMBER_OF_ROUNDS = 3;
    static final int INTERVAL = 100;
    public static void startsTheGameGCD() {
        String userName = Cli.greetsThePlayer();

        String rules = "Find the greatest common divisor of given numbers.";

        int countAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            if (countAnswer == -1) {
                break;
            }
            int number1 = random.nextInt(INTERVAL);
            int number2 = random.nextInt(INTERVAL);

            int correctAnswer = answerToQuestion(number1, number2);

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + number1 + " " + number2;

            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = question;
            questionAndAnswer[1] = correctAnswerToString;

            countAnswer = Engine.upEngine(userName, rules, questionAndAnswer, i, countAnswer);
        }
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
