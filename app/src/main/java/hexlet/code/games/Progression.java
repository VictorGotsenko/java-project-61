package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.numericsRandom;
import static hexlet.code.Util.randomGenerator;

public class Progression {
    public static void gameProgression() {
        int scopeProgression = 10;
        String rule = "What number is missing in the progression?";
        String[] gameQuestions = new String[]{"", "", ""};
        String[] gameAnswers = new String[3];

        int[] generateInitialValue;
        int[] dimProgression;
        int i = 0;
        while (i < gameQuestions.length) {
            generateInitialValue = randomGenerator(scopeProgression);
            // сгенерировать последовательность
            dimProgression = generateProgression(generateInitialValue, scopeProgression);
            // загадать какой член будет ..
            int maskNumber = 1 + numericsRandom.nextInt(dimProgression.length);
            // сделать строчку
            for (int j = 0; j < dimProgression.length; j++) {
                if (j == maskNumber) {
                    gameQuestions[i] = gameQuestions[i] + ".. ";
                    gameAnswers[i] = String.valueOf(dimProgression[j]);
                } else {
                    gameQuestions[i] = gameQuestions[i] + dimProgression[j] + " ";
                }
            }
            i += 1;
        }
        playGame(rule, gameQuestions, gameAnswers);
    }

    static int[] generateProgression(int[] dimRnd, int scope) {
        // сгенерировать последовательность
        int[] dim = new int[scope];
        dim[0] = dimRnd[0];
        for (int i = 1; i < scope; i++) {
            dim[i] = dim[i - 1] + dimRnd[1];
        }
        return dim;
    }
}
