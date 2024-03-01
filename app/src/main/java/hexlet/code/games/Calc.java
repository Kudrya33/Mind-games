package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int MAX_VALUE = 100;
    public static final String RULES = "What is the result of the expression?";
    public static final String[] OPERANDS = {"+", "-", "*"};

    public static void start() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int numberFirst = Utils.getRandomInt(0, MAX_VALUE);
            int numberLast = Utils.getRandomInt(0, MAX_VALUE);

            int selectedOperand = Utils.getRandomInt(0, 2);

            String operand = OPERANDS[selectedOperand];

            int correctAnswer = calculate(numberFirst, numberLast, operand);

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + numberFirst + " " + OPERANDS[selectedOperand] + " " + numberLast;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswerToString;
        }

        Engine.startTheEngine(RULES, questionsAndAnswers);

    }

    public static int calculate(int numberFirst, int numberLast, String operand) {
        return switch (operand) {
            case "+" -> numberFirst + numberLast;
            case "-" -> numberFirst - numberLast;
            case "*" -> numberFirst * numberLast;
            default -> throw new Error("Unknown state!");
        };
    }

}

