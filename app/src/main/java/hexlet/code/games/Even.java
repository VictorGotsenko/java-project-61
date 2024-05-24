package hexlet.code.games;

import static hexlet.code.Engine.numberGameQuestions;
import static hexlet.code.Engine.rangeGenerateNumbers;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Even {
    public static void gameEven() {
        String[][] gameQuestsAnswers = new String[numberGameQuestions][2];
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int guessNumber;
        for (int i = 0; i < numberGameQuestions; i++) {
            guessNumber = randomGeneratorNum(rangeGenerateNumbers);
            gameQuestsAnswers[i][0] = String.valueOf(guessNumber);
            gameQuestsAnswers[i][1] = checkEven(guessNumber);
        }
        playGame(rule, gameQuestsAnswers);
    }

    static String checkEven(int a) {
        if ((a % 2) == 0) {
            return "yes";
        }
        return "no";
    }
}
