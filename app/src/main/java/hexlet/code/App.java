package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.askNamePlayer;
import static hexlet.code.games.Calc.gameCalc;
import static hexlet.code.games.Even.gameEven;
import static hexlet.code.games.GCD.gameGCD;
import static hexlet.code.games.Prime.gamePrime;
import static hexlet.code.games.Progression.gameProgression;

public class App {
    public static void main(String[] args) {

        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGCD = 4;
        final int gameCProgression = 5;
        final int gamePrime = 6;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choiceKey = choiceGame();
        if (choiceKey == 0) {
            System.exit(0);
        }
        if (choiceKey == 1) {
            askNamePlayer();
        }
        if (choiceKey == gameEven) {
            gameEven();
        }
        if (choiceKey == gameCalc) {
            gameCalc();
        }
        if (choiceKey == gameGCD) {
            gameGCD();
        }
        if (choiceKey == gameCProgression) {
            gameProgression();
        }
        if (choiceKey == gamePrime) {
            gamePrime();
        }
    }

    static int choiceGame() {
        Scanner readFromKeyboard = new Scanner(System.in);
        String inputFromKeyboard = "";
        while (!inputFromKeyboard.matches("[0-6]")) {
            inputFromKeyboard = readFromKeyboard.nextLine();
        }
        return Integer.parseInt(inputFromKeyboard);
    }
}
