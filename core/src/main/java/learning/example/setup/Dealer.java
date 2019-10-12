package learning.example.setup;

import java.util.Random;

class Dealer {

   private final String name;
   private final Deck deck;

    public Dealer(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public Deck getDeck() {
        return deck;
    }

    //method selects card from deck pseudo-randomly, removes it from deck and returns selected card
    Card dealCard(){

        Random random = new Random();
        int cardNumber = random.nextInt(this.deck.getCards().size());
        Card cardDealt = this.deck.getCards().get(cardNumber);
        this.deck.getCards().remove(cardDealt);
        return cardDealt;

    }
}
