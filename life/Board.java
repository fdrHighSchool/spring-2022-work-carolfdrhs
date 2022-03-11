public class Board{
  Cell[][] board;

/*
RULES
1.Any live cell with fewer than 2 live neighbors die
2.Any live cell with 2 or 3 neighbors lives on to the next generation
3.Any live cell with more than 3 live neighbors dies
4.Any dead cell with exactly 3 neighbors becomes a live cell

Generations must be seperated
*/

//CONSTRUCTOR
  public Board(int r, int c){
    board = new Cell[r][c];

  }

//goes to the next turn (checks through conditions)
//create new grid, copy grid to seperate generations, loop through the copy grid but change the old grid
  public void nextTurn(){
    Cell[][] boardCopy;

    for(int r = 0; r < board.length; r++){
      for(int c = 0; c < board[r].length; c++){
        if(board[r][c].around(r,c)-1 < 2){
          board[r][c].setStatus(false);
        }
        else if(board[r][c].around(r,c)-1 > 3){
          board[r][c].setStatus(false);

        }
        else if(board[r][c].around(r,c)-1 == 2 || board[r][c].around(r,c)-1 == 3){
          board[r][c].setStatus(true);

        }
      }

    }


  }



//FILLS THE BOARD WITH DEAD CELLS
  public void fill() {
    for(int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[r].length; c++) {
        board[r][c] = new Cell(false);
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
