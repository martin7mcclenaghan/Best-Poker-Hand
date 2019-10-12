package learning.example.setup;

import java.util.ArrayList;
import java.util.List;

//Singleton Design Pattern as there can only be one object that creates the possible list of cards in the game
class DeckProcessor {

    // == static members ==
    private static DeckProcessor instance;

    synchronized static DeckProcessor getInstance(){

        if(instance == null){
            instance = new DeckProcessor();
        }
        return instance;
    }

    // == private constructor ==
    private DeckProcessor() {

    }

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

    //creates deck of 52 cards with no jokers
    private List<Card> createNoJokerDeck (String[] suits, String[] numbers){

        List<Card> deck = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                deck.add(new Card(numbers[j], suits[i]));

            }
        }

        return deck;

    }

    // == instance methods ==
    // returns list of cards forming the standard deck of 52 with no jokers
    List<Card> getStandard52Cards() {
        return new ArrayList<>(createNoJokerDeck(createPossibleSuits(),createPossibleNumbers()));
    }

}
