package learning.example.setup;

class Board extends CardCollection {

    private Dealer dealer;

    public Board(Dealer dealer) {
        super(3, dealer);
        this.dealer = dealer;
    }

    // == instance methods ==
    // method to add card to the board
    void addCardToBoard() {
        if (this.getCards().size() >= 5) {
            System.out.println("Board can only contain 5 cards! Cannot add anymore!");
        } else {
            this.getCards().add(this.dealer.dealCard());
        }
    }


}
