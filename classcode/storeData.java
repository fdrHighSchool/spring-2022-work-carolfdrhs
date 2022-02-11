import java.util.*;


public class storeData{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Student s1 = new Student(1234567,"Jimmy Smith",true,new int[] {90,80,95,90,100});
    Student s2 = new Student(9876543,"Maria Hernandez",false,new int[] {95,100,100,90,90});
    Student s3 = new Student(1357911,"Jamal Jenkins",false,new int[] {90,80,95,90,100});
    Student s4 = new Student(2468101,"Ramiz Ahmed",true,new int[] {90, 100, 75, 85, 90});
    Student s5 = new Student(1928374,"Michael Green",true,new int[] {80, 80, 65, 55, 90});

    System.out.println(s1.getAverage());
    if(s1.getCC()){
      System.out.println("Please report to the auditorium for you take-home test");
    }
    else{
      System.out.println("false");
    }

  }


}
