package learning.example;

import learning.example.console.ConsoleBestPokerHand;
import learning.example.setup.GameService;
import learning.example.setup.GameAssembler;

public class ConsoleMain {

    public static void main(String[] args) {

        GameAssembler gameFacade = new GameAssembler();
        GameService game = gameFacade.assembleGame();
        ConsoleBestPokerHand consoleGame = new ConsoleBestPokerHand(game);
        consoleGame.playGame();
    }
}
