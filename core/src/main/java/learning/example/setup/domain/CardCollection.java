package learning.example.setup.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class CardCollection {

    // == instance variables
    private List<Card> cards;
    private int maxSize;

    // == constructor ==

    public CardCollection(int maxSize) {
        this.cards = new ArrayList<>();
        this.maxSize = maxSize;
    }

    // == instance methods ==
    @Override
    public String toString() {
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
