package learning.example.setup.processingobjects;

import learning.example.setup.valueobjects.Card;

import java.util.ArrayList;
import java.util.List;

public class DeckFormatter {

    public DeckFormatter() {
    }

    // == private methods ==
    //create possible card values
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

    //create possible card suits
    private String [] createPossibleSuits (){

        String [] suits = new String [4];

        suits[0] = "C";
        suits[1] = "S";
        suits[2] = "D";
        suits[3] = "H";

        return suits;

    }

    //creates a List of 52 cards with no jokers
    private List<Card> createNoJokerDeck (String[] suits, String[] numbers){

        List<Card> deck = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                deck.add(new Card(numbers[j], suits[i]));

            }
        }

        return deck;

    }

    // == public methods ==
    // returns list of cards forming the standard deck of 52 with no jokers
    public List<Card> getStandard52Cards() {
        return new ArrayList<>(createNoJokerDeck(createPossibleSuits(),createPossibleNumbers()));
    }

}
