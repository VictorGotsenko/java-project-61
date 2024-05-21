package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorArray;

public class Calc {
    public static void gameCalc() {
        final int rangeGenerateNumbers = 10;
        final int numberGameQuestions = 3;
        String rule = "What is the result of the expression?";
        String[] gameQuestions = new String[numberGameQuestions];
        String[] gameAnswers = new String[numberGameQuestions];

        int[] rangomDimValue;
        int i = 0;
        while (i < gameQuestions.length) {
            rangomDimValue = randomGeneratorArray(rangeGenerateNumbers);
            if (i == 0) {
                gameQuestions[i] = String.valueOf(rangomDimValue[0]) + " * " + String.valueOf(rangomDimValue[1]);
                gameAnswers[i] = String.valueOf(rangomDimValue[0] * rangomDimValue[1]);
            }
            if (i == 1) {
                gameQuestions[i] = String.valueOf(rangomDimValue[0]) + " + " + String.valueOf(rangomDimValue[1]);
                gameAnswers[i] = String.valueOf(rangomDimValue[0] + rangomDimValue[1]);
            }
            if (i == 2) {
                gameQuestions[i] = String.valueOf(rangomDimValue[0]) + " - " + String.valueOf(rangomDimValue[1]);
                gameAnswers[i] = String.valueOf(rangomDimValue[0] - rangomDimValue[1]);
            }
            i += 1;
        }
        playGame(rule, gameQuestions, gameAnswers);
    }
}
