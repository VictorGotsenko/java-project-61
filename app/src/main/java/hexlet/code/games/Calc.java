package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_GAME_QUESTIONS;
import static hexlet.code.Engine.THREE;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Engine.RANGE_GENERATE_NUMBERS;
import static hexlet.code.Util.randomGeneratorNum;

public class Calc {

    public static void gameCalc() {
        String rule = "What is the result of the expression?";
        String[][] gameQuestsAnswers = new String[NUMBER_GAME_QUESTIONS][2];
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++)  {
            gameQuestsAnswers[i] = guessQuestion(RANGE_GENERATE_NUMBERS);
        }
        playGame(rule, gameQuestsAnswers);
    }

    static String[] guessQuestion(int range) {
        String[] guessQA = new String[2];
        final int countMathOperators = 3;
        int a = randomGeneratorNum(range);
        int b = randomGeneratorNum(range);
        switch (randomGeneratorNum(countMathOperators)) {
            case 1:
                guessQA[0] = String.valueOf(a) + " + " + String.valueOf(b);
                guessQA[1] = String.valueOf(a + b);
                break;
            case 2:
                guessQA[0] = String.valueOf(a) + " - " + String.valueOf(b);
                guessQA[1] = String.valueOf(a - b);
                break;
            case THREE:
                guessQA[0] = String.valueOf(a) + " * " + String.valueOf(b);
                guessQA[1] = String.valueOf(a * b);
                break;
            default:
                break;
        }
        return guessQA;
    }
}
