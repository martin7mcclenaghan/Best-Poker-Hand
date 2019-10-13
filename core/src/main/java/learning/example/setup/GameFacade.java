package learning.example.setup;

import learning.example.setup.processingObjects.Dealer;
import learning.example.setup.processingObjects.DeckProcessor;
import learning.example.setup.valueObjects.Board;
import learning.example.setup.valueObjects.Deck;
import learning.example.setup.valueObjects.HoleCards;

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
