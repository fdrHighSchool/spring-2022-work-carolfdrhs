import java.util.*;

public class Pile {
  private ArrayList<Card> deck;
  private ArrayList<Card> p1;
  private ArrayList<Card> p2;

  public Pile(ArrayList<Card> d){
    this.deck  = d;
    this.p1 = new ArrayList<Card>();
    this.p2 = new ArrayList<Card>();
  }

  public void split(){
    for (Card card : this.deck) {
      p1.add(this.deck.remove(0));
      p2.add(this.deck.remove(0));
      //?
    }


  }


  public ArrayList<Card> getP1(){
    return this.p1;
  }
  public ArrayList<Card> getP2(){
    return this.p2;
  }


}
