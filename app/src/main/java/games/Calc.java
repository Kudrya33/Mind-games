package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void startsTheGameCalc() {
        String userName = Cli.greetsThePlayer();

        String rules = "What is the result of the expression?";

        int countAnswer = 0;

        Random random = new Random();
        int numberOfRounds = 3;
        int numberFirst;
        int numberLast;

        for (int i = 0; i < numberOfRounds; i++) {
            if (countAnswer == -1) {
                break;
            }
            numberFirst = random.nextInt(100);
            numberLast = random.nextInt(100);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = random.nextInt(3);
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

