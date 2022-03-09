public class Board{
  Cell[][] board;


//CONSTRUCTOR
  public Board(int r, int c){
    board = new Cell[r][c];

  }



//FILLS THE BOARD WITH DEAD CELLS
  public void fill() {
    for(int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[r].length; c++) {
        board[r][c] = new Cell(false, 1);
      }
    }
  }

//DISPLAYS THE BOARD
  public void display() {
    System.out.println("\033[H\033[2J"); // clear the terminal
    for(int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[r].length; c++) {
        System.out.print(board[r][c] + " ");
      }
      System.out.println();
    }
  }



}
