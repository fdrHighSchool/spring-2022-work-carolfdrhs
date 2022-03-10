public class Cell{
  private boolean status; //true = alive; false = dead;
  private int turn; //turn to seperate the generations

/*
RULES
1.Any live cell with fewer than 2 live neighbors die
2.Any live cell with 2 or 3 neighbors lives on to the next generation
3.Any live cell with more than 3 live neighbors does
4.Any dead cell with exactly 3 neighbors becomes a live cell

Generations must be seperated
*/

//CONSTRUCTOR
  public Cell(boolean s, int t){
    this.status = s;
    this.turn = t;
  }

  public String toString(){
    if(status){
      return "*";
    }
    else{
      return "-";
    }
  }

  public void setStatus(boolean s){
    this.status = s;
  }
  public boolean getStatus(){
    return this.status;
  }




  public int around(int r, int c){
    int numArround = 0;
    for(int i = -1; i <= 1; i++){
      for(int j = -1; j <= 1; j++){
        if(board[r + i][c + j].getStatus()){
          numArround++;
        }
      }
    }
    return numArround;

    }








//goes to the next turn (checks through conditions)
  // public void nextTurn(){
  //
  //
  // }



}
