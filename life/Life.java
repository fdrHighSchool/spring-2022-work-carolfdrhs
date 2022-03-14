import java.util.*;

public class Life{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Board grid = new Board(10,10);

    System.out.println("Game Of Life!\nPress enter to start.");
    s.nextLine();

    grid.fill();
    grid.setPlace(4,6);
    grid.setPlace(5,6);
    grid.setPlace(6,6);
    
    grid.display();
    boolean play = true;



  while(play){
    String next = s.nextLine();
    grid.nextTurn();
    if(next.toLowerCase().equals("quit")){
      play = false;
    }
    else{
      grid.display();
    }


  }



  }








}
