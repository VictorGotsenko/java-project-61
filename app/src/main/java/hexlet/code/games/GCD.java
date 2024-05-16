package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.games.Calc.numericsRandom;

public class GCD {
    public static void gameGCD() {
        String nameUser = getNameUser();
        System.out.println("Find the greatest common divisor of given numbers.");
// Question No 1
        // RND block
        int a = 1 + numericsRandom.nextInt(100);
        int b = 1 + numericsRandom.nextInt(100);
        //
        System.out.println("Question: " + a + " " + b);
        int questResult = findCDG(a, b);
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
        // RND block
        a = 1 + numericsRandom.nextInt(100);
        b = 1 + numericsRandom.nextInt(100);
        //
        System.out.println("Question: " + a + " " + b);
        questResult = findCDG(a, b);
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
        // RND block
        a = 1 + numericsRandom.nextInt(100);
        b = 1 + numericsRandom.nextInt(100);
        //
        System.out.println("Question: " + a + " " + b);
        questResult = findCDG(a, b);
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
