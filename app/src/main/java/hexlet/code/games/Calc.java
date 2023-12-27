package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    static final int INTERVAL = 100;
    static final int NUMBER_OF_ROUNDS = 3;
    static final int COUNT_OPERANDS = 3;
    public static void startsTheGameCalc() {
        String userName = Cli.greetsThePlayer();

        String rules = "What is the result of the expression?";

        int countAnswer = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            if (countAnswer == -1) {
                break;
            }
            int numberFirst = random.nextInt(INTERVAL);
            int numberLast = random.nextInt(INTERVAL);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = random.nextInt(COUNT_OPERANDS);
            String operand = operands[selectedOperand];

            int correctAnswer = answerToQuestion(numberFirst, numberLast, operand);

            String correctAnswerToString = Integer.toString(correctAnswer);

            String question = "Question: " + numberFirst + " " + operands[selectedOperand] + " " + numberLast;

            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = question;
            questionAndAnswer[1] = correctAnswerToString;

            countAnswer = Engine.upEngine(userName, rules, questionAndAnswer, i, countAnswer);
        }
    }
    public static int answerToQuestion(int numberFirst, int numberLast, String operand) {
        int answer;
        switch (operand) {
            case "+":
                answer = numberFirst + numberLast;
                return answer;
            case "-":
                answer = numberFirst - numberLast;
                return answer;
            case "*":
                answer = numberFirst * numberLast;
                return answer;
            default:
                answer = 0;
                return answer;
        }
    }
}

