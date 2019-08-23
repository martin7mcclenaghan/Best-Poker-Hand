package learning.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Singleton Design Pattern as there can only be one deck
public class Deck {

    // == static members ==
    private static Deck instance;

    public synchronized static Deck getInstance(){

        if(instance == null){
            instance = new Deck();
        }
        return instance;
    }

    //instance variables
    private List<Card> cards;

    // == private constructor ==
    private Deck() {
        this.cards = createCardDeck(new String[]{"C", "S", "D", "H"}, createPossibleNumbers());
    }

    private String[] createPossibleNumbers() {

        String[] numbers = new String[13];

        for (int i = 0; i <= 7; i++) {
            numbers[i] = Integer.toString(i + 2);
        }
        numbers[8] = "T";
        numbers[9] = "J";
        numbers[10] = "Q";
        numbers[11] = "K";
        numbers[12] = "A";

        return numbers;
    }

    private List<Card> createCardDeck (String[] suits, String[] numbers){

        List<Card> deck = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                deck.add(new Card(numbers[j], suits[i]));

            }
        }

        return deck;

    }

    // == instance methods ==
    public Card dealCard(){

        Random random = new Random();
        int cardNumber = random.nextInt(this.cards.size());
        Card cardDealt = cards.get(cardNumber);
        this.cards.remove(cardDealt);
        return cardDealt;

    }


}