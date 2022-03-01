public class Metrocard{
  private boolean expiration;
  private String currentTime;
  private int day;//1-7(1-Monday 7-Sunday)
  private int numSwipe = 3;

/*
GOALS:
5am - 8pm time limit ---> 5-20
only on weekdays
time limit between swipes ~20 mins
3 swipes per day
*/


//CONSTRUCTOR
  public Metrocard(boolean expiration, String currentTime,int day){
    this.expiration = expiration;
    this.currentTime = currentTime;
    this.day = day;

  }

  public void setExpiration(boolean e){
    this.expiration = e;

  }

  public boolean getExpiration(){
    return this.expiration;
  }

//counts numbers of swipes on the day (limited 3)
  public void swipe(){
    if(this.numSwipe == 0){
      System.out.println("no more swipes today");
    }
    else{
      this.numSwipe--;
      System.out.println("Swipes remaining: " + numSwipe);
    }

  }

  public int getNumSwipe(){
    return this.numSwipe;

  }

  public void time(){
    int hour = Integer.parseInt(this.currentTime.substring(0,this.currentTime.indexOf(":")));
    // int minutes = Integer.parseInt(this.currentTime.substring(this.currentTime.indexOf(":")+1));
    if(hour<5 || hour>20){
      System.out.println("Invalid time. Only allowed during times: 5am-8pm");

    }
    else{
      System.out.println("time valid");
    }

  }
  public void date(){
    if(this.day == 6 || this.day == 7){
      System.out.println("Can't use on weekends");

    }
    else{
      System.out.println("date valid");
    }
  }





}
