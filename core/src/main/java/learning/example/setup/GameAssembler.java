package learning.example.setup;

import learning.example.setup.processingobjects.DeckService;
import learning.example.setup.processingobjects.DeckFormatter;
import learning.example.setup.valueobjects.Board;
import learning.example.setup.valueobjects.Deck;
import learning.example.setup.valueobjects.HoleCards;

public class GameAssembler {

    // == public methods ==
    public GameService assembleGame() {

        DeckFormatter deckProcessor = new DeckFormatter();
        Deck deck = new Deck(deckProcessor.getStandard52Cards());
        DeckService steve = new DeckService("Steve", deck);
        Board board = new Board();

        //HoleCards must be specified as an implementation to stop players dealing themselves more cards
        //than they are allowed
        HoleCards playerHole = new HoleCards();
        HoleCards opponentHole = new HoleCards();

        return new GameService(deck, board, playerHole, opponentHole);

    }


}
