import java.util.*;


public class storeData{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("How many students do you want to add?");
    int numStudent = s.nextInt();
    Object[][] array2D = new Object[numStudent][4];


    for(int i = 0; i<array2D.length; i++){
      System.out.println("Enter student ID");
      array2D[i][0]=s.nextInt();
      s.nextLine();

      System.out.println("Enter student name");
      array2D[i][1]=s.nextLine();


      System.out.println("Enter close contact(true or false)");
      array2D[i][2]=s.nextBoolean();

      int[] grades = new int[5];
      for(int j = 0; j<grades.length; j++){
        System.out.println("Enter grades(" + j + " out of 5)");
        grades[j] = s.nextInt();
      }
      array2D[i][3]=grades;




    }
    System.out.println(Arrays.deepToString(array2D));

  }


}
