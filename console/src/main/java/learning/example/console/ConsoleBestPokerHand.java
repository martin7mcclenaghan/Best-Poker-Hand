package learning.example.console;

import learning.example.setup.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ConsoleBestPokerHand {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(ConsoleBestPokerHand.class);

    // == fields ==
    private GameService game;

    // == constructor ==
    public ConsoleBestPokerHand(GameService game ) {
        this.game = game;
    }

    public void playGame() {
        System.out.println("Running console version of best poker hand");

        Scanner scanner = new Scanner(System.in);

        // Stage one - players have their cards and board not yet seen
        System.out.println("Your cards are " + game.getPlayerHole());
        log.info("Opponents cards are " + game.getOpponentHole());

        // Stage two - flop
		System.out.println("Now lets see the flop");
		System.out.println(game.getBoard());
        System.out.println("Your best hand is " + game.bestHandFlop(game.getPlayerHole()));
        log.info("Opponent's best hand is " + game.bestHandFlop(game.getOpponentHole()));

		//Stage three - turn
        System.out.println("Now lets see the turn");
        game.dealCard();
        System.out.println(game.getBoard());

        //Stage four - river
        System.out.println("Now lets see the river");
        game.dealCard();
        System.out.println(game.getBoard());


    }

}
