package learning.example.setup.valueobjects;

import learning.example.setup.processingobjects.Dealer;

import java.util.ArrayList;
import java.util.List;

public abstract class CardCollection {

    // == instance variables
    private List<Card> cards;

    // == constructor ==
    public CardCollection(int size, Dealer dealer) {
        this.cards = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.cards.add(dealer.dealCard());
        }
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
}
