import java.util.*;

public class Driver {
  public static void main(String[] args) {

    // create a deck for testing
    Deck deck1 = new Deck();


    // System.out.println(deck1.getLength()); // 52 cards in a standard deck
    // deck1.displayDeck();
    // System.out.println();
    //
    // System.out.println(deck1.shuffle());
    // System.out.println();
    deck1.shuffle();
    Pile g1 = new Pile(deck1);
    g1.split();
    g1.play();


  }
}
