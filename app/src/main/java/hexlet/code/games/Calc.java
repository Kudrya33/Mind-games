package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int MAX_VALUE = 100;

    public static void start() {
        String rules = "What is the result of the expression?";

        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int numberFirst = Utils.getRandomInt(0, MAX_VALUE);
            int numberLast = Utils.getRandomInt(0, MAX_VALUE);

            String[] operands = {"+", "-", "*"};

            int selectedOperand = Utils.getRandomInt(0, 2);

            String operand = operands[selectedOperand];

            int correctAnswer = calculate(numberFirst, numberLast, operand);

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + numberFirst + " " + operands[selectedOperand] + " " + numberLast;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswerToString;
        }

        Engine.startTheEngine(rules, questionsAndAnswers);

    }

    public static int calculate(int numberFirst, int numberLast, String operand) {
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
                throw new Error("Unknown state!");
        }
    }

}

