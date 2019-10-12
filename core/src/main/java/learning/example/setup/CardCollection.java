package learning.example.setup;

import java.util.ArrayList;
import java.util.List;

abstract class CardCollection {

    // == instance variables
    private List<Card> cards;

    // == constructor ==
    CardCollection(int size, Dealer dealer) {
        this.cards = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.cards.add(dealer.dealCard());
        }
    }

    // == instance methods ==
    String getCardsString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Card card : this.cards) {
            stringBuilder.append(card.getDescription());
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    List<Card> getCards (){
        return this.cards;
    }
}
