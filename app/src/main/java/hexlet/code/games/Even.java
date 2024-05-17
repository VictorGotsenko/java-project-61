package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerString;
import static hexlet.code.Engine.getAnswer;

public class Even {
    public static void gameEven() {
        String userAnswer;
        String nameUser = getNameUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
// Question No 1
        System.out.println("Question: 15");
        System.out.printf("Your answer: ");
        checkAnswerString("no", getAnswer());
// Question No 2
        System.out.println("Question: 6");
        System.out.printf("Your answer: ");
        checkAnswerString("yes", getAnswer());
// Question No 3
        System.out.println("Question: 7");
        System.out.printf("Your answer: ");
        checkAnswerString("no", getAnswer());
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
