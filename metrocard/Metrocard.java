public class Metrocard{
  private double price;
  private boolean expiration;
  private int days;
  private boolean unlimited;
  private int dOW;
  private String time;


//CONSTRUCTORS:

//unlimited
public Metrocard(boolean e, int d){
  this.expiration = e;
  this.days = d;
  this.unlimited = true;
  if(this.days == 30){
    this.price = 128;
  }
  else{
    this.price = 34;
  }
}

//regular (2.75 per ride)
public Metrocard(double p){
  this.price = p;
  this.unlimited = false;
}

//student
public Metrocard(int dOW, String time){
  //5am - 8pm time limit
  //only on weekdays
  //time limit between swipes ~20 mins
  //3 swipes per day
}


//METHODS:
public double getPrice(){
  return this.price;
}//end getPrice

//check if card is expired
public void isExpired(){
  if(this.expiration){
    System.out.println("expired");
  }
}//end isExpired

//change the expiration to true or false
public void setE(boolean e){
  this.expiration = e;
}//end setE

//add money to a regular metrocard
public void addMoney(double add){
  this.price += add;
}//end addMoney

//if regular metrocard return original price-2.75 but if unlimited returns the original price
public double swipe(){
  if(this.unlimited){
    return this.price;
  }
  else if(this.unlimited == false){
    this.price -= 2.75;
    return this.price;
  }
  return this.price;//return for if student metrocard
}//end swipe


}//end class
