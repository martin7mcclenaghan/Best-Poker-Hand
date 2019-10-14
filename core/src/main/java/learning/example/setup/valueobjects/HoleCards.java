package learning.example.setup.valueobjects;

import learning.example.setup.processingobjects.DeckService;

public class HoleCards extends CardCollection {

    // == constructor ==
   public HoleCards(DeckService dealer) {
        super(2, dealer);
    }

}
