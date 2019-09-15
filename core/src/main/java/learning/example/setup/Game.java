package learning.example.setup;

public class Game {

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

}
