package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGenerator;

public class GCD {
    public static void gameGCD() {
        int rangeGenerateNumbers = 100;
        String rule = "Find the greatest common divisor of given numbers.";
        String[] gameQuestions = new String[3];
        String[] gameAnswers = new String[3];

        int[] rangomDimValue;
        int i = 0;
        while (i < gameQuestions.length) {
            rangomDimValue = randomGenerator(rangeGenerateNumbers);
            gameQuestions[i] = String.valueOf(rangomDimValue[0]) + " " + String.valueOf(rangomDimValue[1]);
            gameAnswers[i] = String.valueOf(findCDG(rangomDimValue[0], rangomDimValue[1]));
            i += 1;
        }
        playGame(rule, gameQuestions, gameAnswers);
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
