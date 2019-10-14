package learning.example.setup.valueobjects;

import learning.example.setup.processingobjects.DeckService;

public class Board extends CardCollection {

    private DeckService dealer;

    public Board(DeckService dealer) {
        super(3, dealer);
        this.dealer = dealer;
    }

    // == instance methods ==
    // method to add card to the board
    public void addCardToBoard() {
        if (this.getCards().size() >= 5) {
            System.out.println("Board can only contain 5 cards! Cannot add anymore!");
        } else {
            this.getCards().add(this.dealer.dealCard());
        }
    }


}
