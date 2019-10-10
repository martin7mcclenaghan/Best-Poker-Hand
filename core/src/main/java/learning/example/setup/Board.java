package learning.example.setup;

//Singleton Design Pattern used as there can only be one board
class Board extends CardCollection {

    // == static members ==
    private static Board instance;

    synchronized static Board getInstance() {

        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    // == private constructor ==
    private Board() {
        super(3);

    }

    // == instance methods ==
    // method to add card to the board
    void addCardToBoard() {
        if (this.getCards().size() >= 5) {
            System.out.println("Board can only contain 5 cards! Cannot add anymore!");
        } else {
            this.getCards().add(DeckProcessor.getInstance().dealCard());
        }
    }


}
