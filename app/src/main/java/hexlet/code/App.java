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
        printListGame();
        int choiceKey = choiceGame();
        switch (choiceKey) {
            case 0:
                return;
            case 1:
                askNamePlayer();
                break;
            case 2:
                gameEven();
                break;
            case 3:
                gameCalc();
                break;
            case 4:
                gameGCD();
                break;
            case 5:
                gameProgression();
                break;
            case 6:
                gamePrime();
                break;
            default:
                break;
        }
    }

    static int choiceGame() {
        Scanner readFromKeyboard = new Scanner(System.in);
        String inputFromKeyboard = "";
        inputFromKeyboard = readFromKeyboard.nextLine();
        if (!inputFromKeyboard.matches("[0-6]")) {
            System.out.printf("Input error! \nPlease enter numbers between 0-6. Was entered: %s", inputFromKeyboard);
            System.out.println("");
        }
        return Integer.parseInt(inputFromKeyboard);
    }

    static void printListGame() {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");

    }
}
