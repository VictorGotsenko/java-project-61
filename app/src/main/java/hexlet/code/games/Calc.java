package hexlet.code.games;

import static hexlet.code.Engine.numberGameQuestions;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Engine.rangeGenerateNumbers;
import static hexlet.code.Util.randomGeneratorNum;

public class Calc {

    public static void gameCalc() {
        String rule = "What is the result of the expression?";
        String[][] gameQuestsAnswers = new String[numberGameQuestions][2];
        for (int i = 0; i < numberGameQuestions; i++)  {
            gameQuestsAnswers[i] = guessQuestion(rangeGenerateNumbers);
        }
        playGame(rule, gameQuestsAnswers);
    }

    static String[] guessQuestion(int range) {
        String[] guessQA = new String[2];
        int a = randomGeneratorNum(range);
        int b = randomGeneratorNum(range);
        switch (randomGeneratorNum(3)) {
            case 1:
                guessQA[0] = String.valueOf(a) + " + " + String.valueOf(b);
                guessQA[1] = String.valueOf(a + b);
                break;
            case 2:
                guessQA[0] = String.valueOf(a) + " - " + String.valueOf(b);
                guessQA[1] = String.valueOf(a - b);
                break;
            case 3:
                guessQA[0] = String.valueOf(a) + " * " + String.valueOf(b);
                guessQA[1] = String.valueOf(a * b);
                break;
            default:
                break;
        }
        return guessQA;
    }
}
