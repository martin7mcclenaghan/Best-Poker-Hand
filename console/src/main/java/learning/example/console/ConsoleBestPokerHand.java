package learning.example.console;

import learning.example.setup.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ConsoleBestPokerHand {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(ConsoleBestPokerHand.class);

    // == fields ==
    private Game game;

    // == constructor ==
    public ConsoleBestPokerHand() {
        this.game = new Game();
    }

    public void playGame() {
        System.out.println("Running console version of best poker hand");

        Scanner scanner = new Scanner(System.in);

        // Stage one - players have their cards and board not yet seen
        System.out.println("Your cards are " + game.getPlayerHand());
        log.info("Opponents cards are " + game.getOppHand());

        // Stage two - flop
		System.out.println("Now lets see the flop");
		System.out.println(game.getBoard());

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
