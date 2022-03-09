import java.util.*;

public class Life{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Board grid = new Board(30,30);

    System.out.println("Game Of Life!\nPress enter to start.");
    s.nextLine();

    grid.fill();
    grid.display();



  }








}
