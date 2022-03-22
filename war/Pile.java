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
    for(int i = 0; i<this.deck.getShuffle().size()/2; i++){
      this.p1.add(this.deck.getShuffle().get(i));
    }
    for(int i = this.deck.getShuffle().size()/2; i<this.deck.getShuffle().size(); i++){
      this.p2.add(this.deck.getShuffle().get(i));
    }
  }
  public void play(){

    for(int i = 0; i<this.p2.size(); i++){

    }


    while(this.p2.size() > 0){

    }
  }


  public ArrayList<Card> getP1(){
    return this.p1;
  }
  public ArrayList<Card> getP2(){
    return this.p2;
  }

  //?
  public int greater(int i){
    int count1 = 0;
    int count2 = 0;
    if(this.p1.get(i) > this.p2.get(i)){
      count1 += 2;
    }
    else if(this.p2.get(i) > this.p1.get(i)){
      count2 += 2;
    }
    else if(this.p2.get(i) == this.p1.get(i)){
      greater(); //?
    }
  }

}
