public class tester {
  public static void main(String[] args){
    //boolean expiration, String currentTime, int day
    Metrocard m1 = new Metrocard(false,"7:23", 6);
    m1.swipe();
    m1.swipe();
    m1.swipe();

    m1.time();
    m1.date();
  }
}
