package learning.example.setup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    //method selects card from deck pseudo-randomly, removes it from deck and returns selected card
    Card dealCard(){

        Random random = new Random();
        int cardNumber = random.nextInt(this.cards.size());
        Card cardDealt = this.cards.get(cardNumber);
        this.cards.remove(cardDealt);
        return cardDealt;

    }
}
