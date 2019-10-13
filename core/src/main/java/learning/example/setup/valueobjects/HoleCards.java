package learning.example.setup.valueobjects;

import learning.example.setup.processingobjects.Dealer;

public class HoleCards extends CardCollection {

    // == constructor ==
   public HoleCards(Dealer dealer) {
        super(2, dealer);
    }

}
