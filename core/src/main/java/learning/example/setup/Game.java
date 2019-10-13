package learning.example.setup;

import learning.example.setup.valueobjects.Board;
import learning.example.setup.valueobjects.Deck;
import learning.example.setup.valueobjects.HoleCards;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Game {

    //constants
    Logger log = LoggerFactory.getLogger(Game.class);

    // == fields ==
    private final Deck deck;
    private final Board board;
    private final HoleCards playerHole;
    private final HoleCards opponentHole;
    private List<PokerHand> playerPossibleHands;
    private List<PokerHand> opponentPossibleHands;


    // == constructor ==
    public Game(Deck deck, Board board, HoleCards playerHole, HoleCards opponentHole) {
        this.deck = deck;
        this.board = board;
        this.playerHole = playerHole;
        this.opponentHole = opponentHole;
        this.playerPossibleHands = new ArrayList<>();
        this.opponentPossibleHands = new ArrayList<>();
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

    public String bestHandFlop (String holeCards){

        String handDescription =  holeCards + getBoard();
        PokerHand flopHand = new PokerHand(handDescription);
        return handDescription + "which is a " + flopHand.getClassification().name();

    }

}
