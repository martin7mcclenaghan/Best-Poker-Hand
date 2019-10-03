package learning.example;

import learning.example.console.ConsoleBestPokerHand;
import learning.example.setup.Game;
import learning.example.setup.GameFacade;

public class ConsoleMain {

    public static void main(String[] args) {

        GameFacade gameFacade = new GameFacade();
        Game game = gameFacade.assembleGame();
        ConsoleBestPokerHand consoleGame = new ConsoleBestPokerHand(game);
        consoleGame.playGame();
    }
}
