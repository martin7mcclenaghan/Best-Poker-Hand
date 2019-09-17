package learning.example.setup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game {

    //constants
    Logger log = LoggerFactory.getLogger(Game.class);

    // == fields ==
    private final Deck deck;
    private final Board board;
    private final HoleCards playerHand;
    private final HoleCards oppHand;

    // == constructor ==
    public Game() {
        this.deck = Deck.getInstance();
        this.board = Board.getInstance();
        this.playerHand = new HoleCards();
        this.oppHand = new HoleCards();
    }

    // == public methods ==
    public String getBoard() {
        return board.getCardsString();
    }

    public String getPlayerHand() {
        return playerHand.getCardsString();
    }

    public String getOppHand() {
        return oppHand.getCardsString();
    }

    public void dealCard (){
        log.info("Dealing Card to board");
        board.addCardToBoard();
    }

}
