import java.util.*;


public class storeData {
  public static void main(String[] args) {
    // creating instances of the Student class
    Student student1 = new Student("9876543", "Jimmy Smith", true, new int[] {90, 80, 95, 90, 100});
    Student student2 = new Student("1234567", "Maria Hernandez", false, new int[] {95, 100, 100, 90, 90});
    Student student3 = new Student("1357911", "Jamal Jenkins", false, new int[] {85, 85, 95, 100, 90});
    Student student4 = new Student("2468101", "Ramiz Ahmed", true, new int[] {90, 100, 75, 85, 90});
    Student student5 = new Student("1928374", "Michael Green", true, new int[] {80, 80, 65, 55, 90});



    // calling getter methods to display data
    System.out.println(student1.getName() + "'s average is: " + student1.getAverage());
    System.out.println(student2.getName() + "'s average is: " + student2.getAverage());

    // decision making based off of data attached to the object
    if (student1.getCloseContact()) {
      System.out.println("Please report to the auditorium for your take-home COVID test");
    }
    else {
      System.out.println("You are not a close contact, keep masking! Get boosted!");
    }

    student1.setCloseContact(true);
    student2.setCloseContact(false);
    student3.setCloseContact(false);
    student4.setCloseContact(true);
    student5.setCloseContact(true);

//test method
    if(student5.isFailing()){
      System.out.println(student5.getName() + " is failing");
    }
    if(student1.isFailing()){
      System.out.println(student1.getName() + " is failing");
    }
    else{
      System.out.println(student1.getName() + " is passing");
    }




  } // end main method

} // end class
