package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Even {
    public static void gameEven() {
        final int rangeGenerateNumbers = 10;
        final int numberGameQuestions = 3;
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] gameQuestions = new String[numberGameQuestions];
        String[] gameAnswers = new String[numberGameQuestions];
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
