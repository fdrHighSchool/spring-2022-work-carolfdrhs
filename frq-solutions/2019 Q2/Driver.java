public class Driver{
  public static void main(String[] args){
    Steptracker t1 = new Steptracker(10000);
    System.out.println(t1.activeDays());
    System.out.println(t1.averageSteps());
    t1.addDailySteps(9000);
    t1.addDailySteps(5000);
    System.out.println(t1.activeDays());
    System.out.println(t1.averageSteps());
    t1.addDailySteps(13000);
    System.out.println(t1.activeDays());
    System.out.println(t1.averageSteps());
    t1.addDailySteps(23000);
    t1.addDailySteps(1111);
    System.out.println(t1.activeDays());
    System.out.println(t1.averageSteps());







  }






}
