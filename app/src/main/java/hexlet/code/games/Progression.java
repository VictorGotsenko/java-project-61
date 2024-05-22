package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorArray;
import static hexlet.code.Util.randomGeneratorNum;

public class Progression {
    public static void gameProgression() {
        final int scopeProgression = 9;
        final int numberGameQuestions = 3;
        String rule = "What number is missing in the progression?";
        String[] gameQuestions = new String[numberGameQuestions];
        String[] gameAnswers = new String[numberGameQuestions];
        int[] generateInitialValue;
        int[] dimProgression;
        int i = 0;
        while (i < gameQuestions.length) {
            // сгенерировать начальные значения для построения прогрессии
            generateInitialValue = randomGeneratorArray(scopeProgression);
            // сгенерировать последовательность
            dimProgression = generateProgression(generateInitialValue, scopeProgression);
            // загадать какой член будет скрыт
            int hiddenIndex = randomGeneratorNum(scopeProgression);
            // сделать строчку
            gameQuestions[i] = buildingString(dimProgression, hiddenIndex);
            gameAnswers[i] = String.valueOf(dimProgression[hiddenIndex]);
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

    static String buildingString(int[] dimProgression, int hiddenIndex) {
        // прогрессия, ответ
        String st = "..";
        // если скрыт первый член
        if (!(hiddenIndex == 0)) {
            st = String.valueOf(dimProgression[0]) + " "; // первый член прогрессии
        }
        // сделать строчку
        for (int j = 1; j < dimProgression.length; j++) {
            if (j == hiddenIndex) {
                st = st + ".. ";
            } else {
                st = st + dimProgression[j] + " ";
            }
        }
        return st;
    }
}
