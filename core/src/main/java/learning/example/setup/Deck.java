package learning.example.setup;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }
}
