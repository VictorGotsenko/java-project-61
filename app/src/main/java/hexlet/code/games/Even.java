package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.getAnswer;

public class Even {
    public static void gameEven() {
        String userAnswer;
        String nameUser = getNameUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: 15");
        System.out.printf("Your answer: ");
        userAnswer = getAnswer();
        if (!userAnswer.equalsIgnoreCase("no")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again," + nameUser);
            return;
        } else {
            System.out.println("Correct!");
        }
//  Next question
        System.out.println("Question: 6");
        System.out.printf("Your answer: ");
        userAnswer = getAnswer();
        if (!userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again," + nameUser);
            return;
        } else {
            System.out.println("Correct!");
        }
// Next question
        System.out.println("Question: 7");
        System.out.printf("Your answer: ");
        userAnswer = getAnswer();
        if (!userAnswer.equalsIgnoreCase("no")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again," + nameUser);
            return;
        } else {
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
