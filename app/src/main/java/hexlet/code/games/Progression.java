package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_GAME_QUESTIONS;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Progression {
    public static void gameProgression() {
        final int scopeProgression = 10;
        String[][] gameQuestsAnswers = new String[NUMBER_GAME_QUESTIONS][2];
        int a = 0;
        int b = 0;
        int hiddenIndex = 0;
        int[] progress = new int[scopeProgression];
        String rule = "What number is missing in the progression?";

        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            progress = generateProgression(randomGeneratorNum(scopeProgression),
                    randomGeneratorNum(scopeProgression), scopeProgression);
            hiddenIndex = randomGeneratorNum(scopeProgression);
            // if the first member is hidden
            if ((hiddenIndex - 1) == 0) {
                gameQuestsAnswers[i][0] = ".. ";
                gameQuestsAnswers[i][1] = String.valueOf(progress[0]);
            } else {
                gameQuestsAnswers[i][0] = String.valueOf(progress[0]) + " ";
            }
            for (int j = 1; j < progress.length; j++) {
                if ((hiddenIndex - 1) == j) {
                    gameQuestsAnswers[i][0] = gameQuestsAnswers[i][0] + ".. ";
                    gameQuestsAnswers[i][1] = String.valueOf(progress[j]);
                    continue;
                }
                gameQuestsAnswers[i][0] = gameQuestsAnswers[i][0]
                        + String.valueOf(progress[j]) + " ";
            }
        }
        playGame(rule, gameQuestsAnswers);
    }

    static int[] generateProgression(int a, int b, int lenght) {
        int[] progression = new int[lenght];
        progression[0] = a;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = a + (i * b);
        }
        return progression;
    }
}
