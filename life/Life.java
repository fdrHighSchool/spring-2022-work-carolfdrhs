import java.util.*;

public class Life{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String[][] board = new String[30][30];

    System.out.println("Game Of Life!\nPress enter to start.");
    s.nextLine();

    fillBoard(board);
    displayBoard(board);
    Cell c1 = new Cell(board,true,1);

  }


  public static void fillBoard(String[][] board) {
    for(int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[r].length; c++) {
        board[r][c] = "~";
      }
    }
  }

  public static void displayBoard(String[][] board) {
    System.out.println("\033[H\033[2J"); // clear the terminal
    for(int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[r].length; c++) {
        System.out.print(board[r][c] + " ");
      }
      System.out.println();
    }
  }



}
