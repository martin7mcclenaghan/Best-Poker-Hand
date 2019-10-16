package learning.example.setup.valueobjects;

import java.util.ArrayList;
import java.util.List;

public abstract class CardCollection {

    // == instance variables
    private List<Card> cards;
    private int maxSize;

    // == constructor ==

    //TODO inject List<Card> of into Card Collection Constructor, cards will then be dealt from GameService

    public CardCollection(int maxSize) {
        this.cards = new ArrayList<>();
        this.maxSize = maxSize;

        //leave in until can be safely deleted
        //Service then deals cards as part of assemble game method
//        for (int i = 0; i < size; i++) {
//            this.cards.add(dealer.dealCard());
//        }
    }

    // == instance methods ==
    public String getCardsString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Card card : this.cards) {
            stringBuilder.append(card.getDescription());
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    public List<Card> getCards (){
        return this.cards;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
