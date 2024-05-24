package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_GAME_QUESTIONS;
import static hexlet.code.Engine.RANGE_GENERATE_NUMBERS;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class GCD {
    public static void gameGCD() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] gameQuestsAnswers = new String[NUMBER_GAME_QUESTIONS][2];
        int a = 0;
        int b = 0;
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            a = randomGeneratorNum(RANGE_GENERATE_NUMBERS);
            b = randomGeneratorNum(RANGE_GENERATE_NUMBERS);
            gameQuestsAnswers[i][0] = String.valueOf(a) + " " + String.valueOf(b);
            gameQuestsAnswers[i][1] = String.valueOf(findCDG(a, b));
        }
        playGame(rule, gameQuestsAnswers);
    }

    public static int findCDG(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return b;
    }
}
