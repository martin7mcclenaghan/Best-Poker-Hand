package learning.example.setup;

public class GameFacade {

    // == public methods ==
    public Game assembleGame() {

        DeckProcessor deckProcessor = DeckProcessor.getInstance();
        Deck deck = new Deck(deckProcessor.getStandard52Cards());
        Board board = Board.getInstance();

        //HoleCards must be specified as an implementation to stop players dealing themselves more cards
        //than they are allowed
        HoleCards playerHole = new HoleCards();
        HoleCards opponentHole = new HoleCards();

        return new Game(deck, board, playerHole, opponentHole);

    }


}
