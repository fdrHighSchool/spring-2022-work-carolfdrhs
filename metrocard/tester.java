public class tester {
  public static void main(String[] args){
    //boolean expiration, String currentTime, int day
    Metrocard m1 = new Metrocard(false,"7:23", 6);
    if(m1.getExpiration()){
      System.out.println("expired");
    }
    m1.time();
    m1.date();

    m1.swipe();
    m1.swipe();
    m1.swipe();
    m1.swipe();

    m1.nextDay();
    m1.swipe();
    System.out.println(m1.getTime());

  }
}
