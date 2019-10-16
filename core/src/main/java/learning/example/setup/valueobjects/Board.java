package learning.example.setup.valueobjects;

import learning.example.setup.processingobjects.DeckService;

public class Board extends CardCollection {

    private DeckService dealer;

    public Board() {
        super(3);
    }

    // == instance methods ==

    // TODO this needs to be taken care of in the Game Service
    // method to add card to the board
    public void addCardToBoard() {
        if (this.getCards().size() >= 5) {
            System.out.println("Board can only contain 5 cards! Cannot add anymore!");
        } else {
            this.getCards().add(this.dealer.dealCard());
        }
    }


}
