package learning.example;

public class Card {

    private String description;

    public Card(String number, String suit) {
        this.description = number + suit;
    }

    public String getDescription() {
        return description;
    }


}
