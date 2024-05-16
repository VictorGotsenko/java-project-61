package hexlet.code;

//import  hexlet.code.*;
import static hexlet.code.Cli.askNamePlayer;
import static hexlet.code.Engine.choiceGame;
import static hexlet.code.Engine.printGameList;
import static hexlet.code.games.Calc.gameCalc;
import static hexlet.code.games.Even.gameEven;

public class App {
    public static void main(String[] args) {
        printGameList();
        int choiceKey = choiceGame();
        if (choiceKey == 0) {
            System.exit(0);
        }
        if (choiceKey == 1) {
            askNamePlayer();
        }
        if (choiceKey == 2) {
            askNamePlayer();
            gameEven();
        }
        if (choiceKey == 3) {
            askNamePlayer();
            gameCalc();
        }
    }
}
