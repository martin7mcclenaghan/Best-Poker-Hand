package learning.example.setup.valueObjects;

import learning.example.setup.processingObjects.Dealer;

public class HoleCards extends CardCollection {

    // == constructor ==
   public HoleCards(Dealer dealer) {
        super(2, dealer);
    }

}
