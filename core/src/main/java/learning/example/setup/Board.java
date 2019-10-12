package learning.example.setup;

//Singleton Design Pattern used as there can only be one board in the whole world - not true if multiple games
class Board extends CardCollection {

    private Dealer dealer;

    public Board(Dealer dealer) {
        super(3, dealer);
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
