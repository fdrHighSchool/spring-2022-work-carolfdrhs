public class Metrocard{
  private double price;
  private boolean expiration;
  private int days;
  private boolean unlimited;
  private int dOW;
  private String time;



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
}








public double getPrice(){
  return this.price;
}


public void isExpired(){
  if(this.expiration){
    System.out.println("expired");
  }
}
public void setE(boolean e){
  this.expiration = e; 
}


public double addMoney(double add){
  return this.price + add;

}

public double swipe(){
  if(this.unlimited == false){
    this.price -= 2.75;
  }
  return this.price;
}


}//end class
