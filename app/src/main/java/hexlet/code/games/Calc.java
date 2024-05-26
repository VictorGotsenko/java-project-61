package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_GAME_QUESTIONS;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Calc {

    public static void gameCalc() {
        final int scopeGameNumbers = 10;
        int a = 0;
        int b = 0;
        int operation = 0;
        String[] mathOperations = new String[]{"+", "-", "*"};
        String rule = "What is the result of the expression?";
        String[][] gameQuestsAnswers = new String[NUMBER_GAME_QUESTIONS][2];
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            a = randomGeneratorNum(scopeGameNumbers);
            b = randomGeneratorNum(scopeGameNumbers);
            operation = randomGeneratorNum(mathOperations.length);
            gameQuestsAnswers[i][0] = String.valueOf(a) + " "
                    + mathOperations[operation - 1] + " " + String.valueOf(b);
            gameQuestsAnswers[i][1] = calcAnswer(a, b, mathOperations[operation - 1]);
        }
        playGame(rule, gameQuestsAnswers);
    }

    static String calcAnswer(int a, int b, String operation) {
        String answer = "";
        switch (operation) {
            case "+" -> {
                answer = Integer.toString(a + b);
            }
            case "-" -> {
                answer = Integer.toString(a - b);
            }
            case "*" -> {
                answer = Integer.toString(a * b);
            }
            default -> {
            }


        }
        return answer;
    }

}
