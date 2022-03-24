import java.util.*;

public class Pile {
  private Deck deck;
  private ArrayList<Card> p1;
  private ArrayList<Card> p2;
  private int count1;
  private int count2;

  public Pile(Deck d){
    this.deck  = d;
    this.p1 = new ArrayList<Card>();
    this.p2 = new ArrayList<Card>();
    this.count1 = 0;
    this.count2 = 0;
  }

  public void split(){
    for(int i = 0; i<this.deck.getShuffle().size()/2; i++){
      this.p1.add(this.deck.getShuffle().get(i));
    }
    for(int i = this.deck.getShuffle().size()/2; i<this.deck.getShuffle().size(); i++){
      this.p2.add(this.deck.getShuffle().get(i));
    }
  }
  public void play(){

    for(int i = 0; i<this.p2.size(); i++){
      // System.out.println("Player 1: " + this.p1.get(i));
      // System.out.println("Player 2: " + this.p2.get(i));
      // System.out.println();
      if(this.p2.get(i).getValue() == this.p1.get(i).getValue()){
        // System.out.println("war");
        // System.out.println();
        i+=4;
      }
      if(i < this.p2.size()){
        greater(i);
      }
    }
    if(count1 > count2){
      System.out.println("player 1 wins");
    }
    else if(count2 > count1){
      System.out.println("player 2 wins");
    }
    else{
      System.out.println("tie");
    }

  }


  public ArrayList<Card> getP1(){
    return this.p1;
  }
  public ArrayList<Card> getP2(){
    return this.p2;
  }

  //i = index
  public void greater(int i){
    if(this.p1.get(i).getValue() > this.p2.get(i).getValue()){
      this.count1 += 2;
      // System.out.println("player 1 is greater");
    }
    else if(this.p2.get(i).getValue() > this.p1.get(i).getValue()){
      this.count2 += 2;
      // System.out.println("player 2 is greater");
    }

  }

}
