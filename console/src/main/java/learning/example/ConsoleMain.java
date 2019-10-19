package learning.example;

import learning.example.console.ConsoleBestPokerHand;
import learning.example.setup.GameService;
import learning.example.setup.GameAssembler;

public class ConsoleMain {

    public static void main(String[] args) {

        GameAssembler gameAssembler = new GameAssembler();
        GameService gameService = gameAssembler.assembleGame();
        ConsoleBestPokerHand consoleGame = new ConsoleBestPokerHand(gameService);
        consoleGame.playGame();
    }
}
