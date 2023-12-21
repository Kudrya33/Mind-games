package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    static final int INTERVAL = 100;
    public static void startsTheGameCalc() {
        String userName = Cli.greetsThePlayer();

        String rules = "What is the result of the expression?";

        int countAnswer = 0;

        Random random = new Random();
        int numberOfRounds = 3;
        int numberFirst;
        int numberLast;
        int countOperands = 3;

        for (int i = 0; i < numberOfRounds; i++) {
            if (countAnswer == -1) {
                break;
            }
            numberFirst = random.nextInt(INTERVAL);
            numberLast = random.nextInt(INTERVAL);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = random.nextInt(countOperands);
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

