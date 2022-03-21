import java.util.*;

public class Pile {
  private Deck deck;
  private ArrayList<Card> p1;
  private ArrayList<Card> p2;

  public Pile(Deck d){
    this.deck  = d;
    this.p1 = new ArrayList<Card>();
    this.p2 = new ArrayList<Card>();
  }

  public void split(){
    for(int i = 0; i<26; i++){
      this.p1.add(this.deck.getShuffle().get(i));
    }
    for(int i = this.deck.getShuffle().size()/2; i<52; i++){
      this.p2.add(this.deck.getShuffle().get(i));
    }
  }
  // public void toString(){
  //
  // }


  public ArrayList<Card> getP1(){
    return this.p1;
  }
  public ArrayList<Card> getP2(){
    return this.p2;
  }


}
