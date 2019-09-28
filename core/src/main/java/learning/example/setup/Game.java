package learning.example.setup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game {

    //constants
    Logger log = LoggerFactory.getLogger(Game.class);

    // == fields ==
    private final Deck deck;
    private final Board board;
    private final HoleCards playerHole;
    private final HoleCards opponentHole;


    // == constructor ==
    public Game() {
        this.deck = Deck.getInstance();
        this.board = Board.getInstance();
        this.playerHole = new HoleCards();
        this.opponentHole = new HoleCards();
    }

    // == public methods ==
    public String getBoard() {
        return board.getCardsString();
    }

    public String getPlayerHole() {
        return playerHole.getCardsString();
    }

    public String getOpponentHole() {
        return opponentHole.getCardsString();
    }

    public void dealCard (){
        log.info("Dealing Card to board");
        board.addCardToBoard();
    }

}
