package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.getAnswer;

public class Calc {
    public static void gameCalc() {
        String nameUser = getNameUser();
        // RND block
        Random numericsRandom = new Random();
        int a = numericsRandom.nextInt(10);
        int b = numericsRandom.nextInt(10);
//        int operationNumber = numericsRandom.nextInt(3);
// Question No 1
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + a + " * " + b);
        int questResult = a * b;
        System.out.printf("Your answer: ");
        int yourAnswer = Integer.parseInt(getAnswer());
        if (!(yourAnswer == questResult)) {
            System.out.println("\'" + yourAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + questResult + "\'.");
            System.out.println("Let's try again," + nameUser);
            return;
        } else {
            System.out.println("Correct!");
        }
// Question No 2
        a = numericsRandom.nextInt(10);
        b = numericsRandom.nextInt(10);
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + a + " + " + b);
        questResult = a + b;
        System.out.printf("Your answer: ");
        yourAnswer = Integer.parseInt(getAnswer());
        if (!(yourAnswer == questResult)) {
            System.out.println("\'" + yourAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + questResult + "\'.");
            System.out.println("Let's try again," + nameUser);
            return;
        } else {
            System.out.println("Correct!");
        }
// Question No 3
        a = numericsRandom.nextInt(10);
        b = numericsRandom.nextInt(10);
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + a + " - " + b);
        questResult = a - b;
        System.out.printf("Your answer: ");
        yourAnswer = Integer.parseInt(getAnswer());
        if (!(yourAnswer == questResult)) {
            System.out.println("\'" + yourAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + questResult + "\'.");
            System.out.println("Let's try again," + nameUser);
            return;
        } else {
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
