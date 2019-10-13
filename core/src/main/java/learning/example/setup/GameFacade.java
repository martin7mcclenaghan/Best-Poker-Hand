package learning.example.setup;

import learning.example.setup.processingobjects.Dealer;
import learning.example.setup.processingobjects.DeckFormatter;
import learning.example.setup.valueobjects.Board;
import learning.example.setup.valueobjects.Deck;
import learning.example.setup.valueobjects.HoleCards;

public class GameFacade {

    // == public methods ==
    public Game assembleGame() {

        DeckFormatter deckProcessor = new DeckFormatter();
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
