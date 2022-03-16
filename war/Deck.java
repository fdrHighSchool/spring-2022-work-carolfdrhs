import java.util.*;

public class Deck {
  private ArrayList<Card> deck;
  private ArrayList<Card> shuffledDeck;

  public Deck() {
    this.deck = new ArrayList<Card>();
    this.shuffledDeck = new ArrayList<Card>();

    for(int suit = 0; suit <= 3; suit++) {
      for(int value = 2; value <= 14; value++) {
        this.deck.add(new Card(value, suit));
      } // end inner for loop
    } // end outer for loop

  } // end constructor method

  public int getLength() {
    return deck.size();
  }

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }


  public ArrayList<Card> shuffle(){
    while(deck.size() > 0){
      int index = (int) (Math.random() * this.deck.size());
      Card removedCard = this.deck.remove(index);
      this.shuffledDeck.add(removedCard);

    }
    return this.shuffledDeck;

  }

} // end class
