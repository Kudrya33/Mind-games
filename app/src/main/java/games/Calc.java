package games;

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
        int numberFirst;
        int numberLast;

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            if (countAnswer == -1) {
                break;
            }
            numberFirst = random.nextInt(INTERVAL);
            numberLast = random.nextInt(INTERVAL);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = random.nextInt(COUNT_OPERANDS);
            String operand = operands[selectedOperand];
            int correctAnswer = switch (operand) {
                case "+" -> numberFirst + numberLast;
                case "-" -> numberFirst - numberLast;
                case "*" -> numberFirst * numberLast;
                default -> 0;
            };
            String correctAnswerToString = Integer.toString(correctAnswer);

            String question = "Question: " + numberFirst + " " + operands[selectedOperand] + " " + numberLast;
            countAnswer = Engine.upEngine(userName, rules, question, correctAnswerToString, i, countAnswer);
        }
    }
}

