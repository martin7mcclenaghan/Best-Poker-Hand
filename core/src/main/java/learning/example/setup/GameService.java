package learning.example.setup;

import learning.example.setup.valueobjects.Board;
import learning.example.setup.valueobjects.Card;
import learning.example.setup.valueobjects.Deck;
import learning.example.setup.valueobjects.HoleCards;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameService {

    //constants
    Logger log = LoggerFactory.getLogger(GameService.class);

    // == fields ==
    private final Deck deck;
    private final Board board;
    private final HoleCards playerHole;
    private final HoleCards opponentHole;
    private List<PokerHand> playerPossibleHands;
    private List<PokerHand> opponentPossibleHands;


    // == constructor ==
    public GameService(Deck deck, Board board, HoleCards playerHole, HoleCards opponentHole) {
        this.deck = deck;
        this.board = board;
        this.playerHole = playerHole;
        this.opponentHole = opponentHole;
        this.playerPossibleHands = new ArrayList<>();
        this.opponentPossibleHands = new ArrayList<>();
    }

    // == private methods ==
    private Card getCardFromDeck(){
        Random random = new Random();
        int cardNumber = random.nextInt(this.deck.getCards().size());
        Card cardDealt = this.deck.getCards().get(cardNumber);
        this.deck.getCards().remove(cardDealt);
        return cardDealt;

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

    //method deals 2 cards to playerHole and opponentHole and deals three communal cards to to the board
    public void setupGame () {
        for (int i = 0; i < playerHole.getMaxSize(); i++){
            playerHole.getCards().add(getCardFromDeck());
        }

        for (int i = 0; i < opponentHole.getMaxSize(); i++){
            opponentHole.getCards().add(getCardFromDeck());
        }

        //Board must be different as holds 3, 4 then 5 cards depending on the phase of the game
        for (int i = 0; i < 3; i++){
            board.getCards().add(getCardFromDeck());
        }
    }

    public void addCardToBoard(){
        log.info("Dealing Card to board");
        board.getCards().add(getCardFromDeck());
    }

    public String bestHandFlop (String holeCards){

        String handDescription =  holeCards + getBoard();
        PokerHand flopHand = new PokerHand(handDescription);
        return handDescription + "which is a " + flopHand.getClassification().name();

    }

}
