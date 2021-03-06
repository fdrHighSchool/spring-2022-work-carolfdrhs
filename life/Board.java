public class Board{
  Cell[][] board;
  Cell[][] boardCopy;

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
    boardCopy = new Cell[r][c];

  }

//for testing
  public void setPlace(int r, int c){
    board[r][c].setStatus(true);
  }



//goes to the next turn (checks through conditions)
//create new grid, copy grid to seperate generations, loop through the copy grid but change the old grid
  public void nextTurn(){
    //copies the board
    for(int r = 0; r < board.length; r++){
      for(int c = 0; c < board[r].length; c++){
        boardCopy[r][c] = board[r][c];
      }
    }

    //loops through the copy
    for(int r = 0; r < boardCopy.length; r++){
      for(int c = 0; c < boardCopy[r].length; c++){
        if(boardCopy[r][c].getStatus() && boardCopy[r][c].around(r,c,boardCopy) < 2){
          board[r][c].setStatus(false);
        }
        else if(boardCopy[r][c].getStatus() && boardCopy[r][c].around(r,c,boardCopy) > 3){
          board[r][c].setStatus(false);

        }
        else if(boardCopy[r][c].around(r,c,boardCopy) == 2){
          board[r][c].setStatus(true);

        }
        else if (boardCopy[r][c].getStatus() == false && boardCopy[r][c].around(r,c,boardCopy) == 3){
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
