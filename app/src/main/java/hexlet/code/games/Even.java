package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Even {
    public static void gameEven() {
        final int rangeGenerateNumbers = 10;
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final String[] gameQuestions = new String[3];
        final String[] gameAnswers = new String[3];
        int guessNumber;

        int i = 0;
        while (i < gameQuestions.length) {
            guessNumber = randomGeneratorNum(rangeGenerateNumbers);
            gameQuestions[i] = String.valueOf(guessNumber);
            gameAnswers[i] = checkEven(guessNumber);
            i += 1;
        }
        playGame(rule, gameQuestions, gameAnswers);
    }

    static String checkEven(int a) {
        if ((a % 2) == 0) {
            return "yes";
        }
        return "no";
    }
}
