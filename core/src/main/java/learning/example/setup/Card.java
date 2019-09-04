package learning.example.setup;

class Card {

    private String description;

    Card(String number, String suit) {
        this.description = number + suit;
    }

    String getDescription() {
        return description;
    }


}
