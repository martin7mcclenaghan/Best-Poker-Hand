package learning.example.console;

import learning.example.setup.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ConsoleBestPokerHand {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(ConsoleBestPokerHand.class);

    // == fields ==
    private GameService gameService;

    // == constructor ==
    public ConsoleBestPokerHand(GameService gameService) {
        this.gameService = gameService;
    }

    public void playGame() {
        System.out.println("Running console version of best poker hand");

        Scanner scanner = new Scanner(System.in);

        // Stage one - players and the board are dealt their cards
        gameService.setupGame();
        System.out.println("Your cards are " + gameService.getPlayerHole());
        log.info("Opponents cards are " + gameService.getOpponentHole());

        // Stage two - flop
		System.out.println("Now lets see the flop");
		System.out.println(gameService.getBoard());
        System.out.println("Your best hand is " + gameService.bestHandFlop(gameService.getPlayerHole().toString()));
        log.info("Opponent's best hand is " + gameService.bestHandFlop(gameService.getOpponentHole().toString()));

		//Stage three - turn
        System.out.println("Now lets see the turn");
        gameService.dealCardToBoard();
        System.out.println(gameService.getBoard());

        //Stage four - river
        System.out.println("Now lets see the river");
        gameService.dealCardToBoard();
        System.out.println(gameService.getBoard());


    }

}
