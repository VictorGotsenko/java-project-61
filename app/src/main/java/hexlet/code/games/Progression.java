package hexlet.code.games;

import static hexlet.code.Engine.numberGameQuestions;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Progression {
    public static void gameProgression() {
        final int scopeProgression = 10;
        String[][] gameQuestsAnswers = new String[numberGameQuestions][2];
        String rule = "What number is missing in the progression?";

        for (int i = 0; i < numberGameQuestions; i++) {
            gameQuestsAnswers[i] = guessProgression(scopeProgression);
        }
        playGame(rule, gameQuestsAnswers);
    }

    static String[] guessProgression(int scope) {
        String[] makeQA = new String[]{"", ""};
        int a = randomGeneratorNum(scope);    // begin value
        int b = randomGeneratorNum(scope);    // delta
        int hiddenIndex = randomGeneratorNum(scope);
        // if the first member is hidden
        if ((hiddenIndex - 1) == 0) {
            makeQA[0] = ".. ";
            makeQA[1] = String.valueOf(a);
        } else {
            makeQA[0] = String.valueOf(a) + " ";
        }
        for (int i = 1; i < scope; i++) {
            if ((hiddenIndex - 1) == i) {
                makeQA[0] = makeQA[0] + ".. ";
                makeQA[1] = String.valueOf(a + (i * b));
                continue;
            }
            makeQA[0] = makeQA[0] + String.valueOf(a + (i * b)) + " ";
        }
        return makeQA;
    }
}
