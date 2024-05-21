package hexlet.code;

import static hexlet.code.Cli.askNamePlayer;
import static hexlet.code.Engine.readFromKeyboard;
import static hexlet.code.games.Calc.gameCalc;
import static hexlet.code.games.Even.gameEven;
import static hexlet.code.games.GCD.gameGCD;
import static hexlet.code.games.Prime.gamePrime;
import static hexlet.code.games.Progression.gameProgression;

public class App {
    public static void main(String[] args) {
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
        if (choiceKey == 2) {
            gameEven();
        }
        if (choiceKey == 3) {
            gameCalc();
        }
        if (choiceKey == 4) {
            gameGCD();
        }
        if (choiceKey == 5) {
            gameProgression();
        }
        if (choiceKey == 6) {
            gamePrime();
        }
    }

    static int choiceGame() {
        String inputFromKeyboard = "";
        while (!inputFromKeyboard.matches("[0-6]")) {
            inputFromKeyboard = readFromKeyboard.nextLine();
        }
        int result = Integer.parseInt(inputFromKeyboard);
        return result;
    }
}
