package learning.example.setup;

public class Game {

    private final Deck deck;
    private final Board board;
    private final HoleCards playerHand;
    private final HoleCards oppHand;

    public Game(Deck deck, Board board, HoleCards playerHand, HoleCards oppHand) {
        this.deck = deck;
        this.board = board;
        this.playerHand = playerHand;
        this.oppHand = oppHand;
    }

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