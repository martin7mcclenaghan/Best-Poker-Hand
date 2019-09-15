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

        // Stage two - board
		System.out.println("Now lets see the board");
		System.out.println(game.getBoard());

		//Stage three - what is the best hand you can make?


    }

}
