package hexlet.code.games;

import java.util.Arrays;

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
        int[] questionProgrss = new int[scopeProgression];
        String rule = "What number is missing in the progression?";

        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            questionProgrss = generateProgression(randomGeneratorNum(scopeProgression),
                    randomGeneratorNum(scopeProgression), scopeProgression);
            // in the first convert int -> String
            String[] tmp = Arrays.toString(questionProgrss).split("[\\[\\]]")[1].split(", ");

            // Вычислю ответ, вытащу его из массива
            hiddenIndex = randomGeneratorNum(scopeProgression);
            gameQuestsAnswers[i][1] = tmp[hiddenIndex];
            // подменив в нужном месте эленмент
            tmp[hiddenIndex] = "..";

            // make string builder and convert progression to string
            StringBuilder builder = new StringBuilder();
            for (String st : tmp) {
                builder.append(st + " ");
            }
            gameQuestsAnswers[i][0] = builder.toString();
        }
        playGame(rule, gameQuestsAnswers);
    }

    static int[] generateProgression(int firstElement, int stepPrgrss, int lenghtPrgrss) {
        int[] progression = new int[lenghtPrgrss];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = firstElement + (i * stepPrgrss);
        }
        return progression;
    }
}
