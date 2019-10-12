package learning.example.setup;

public class GameFacade {

    // == public methods ==
    public Game assembleGame() {

        DeckProcessor deckProcessor = DeckProcessor.getInstance();
        Deck deck = new Deck(deckProcessor.getStandard52Cards());
        Dealer steve = new Dealer("Steve", deck);
        Board board = new Board(steve);

        //HoleCards must be specified as an implementation to stop players dealing themselves more cards
        //than they are allowed
        HoleCards playerHole = new HoleCards(steve);
        HoleCards opponentHole = new HoleCards(steve);

        return new Game(deck, board, playerHole, opponentHole);

    }


}
