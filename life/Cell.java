public class Cell{
  private boolean status; //true = alive; false = dead;



//CONSTRUCTOR
  public Cell(boolean s){
    this.status = s;
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


  public int around(int r, int c, Cell[][] board){
    int numArround = 0;
    for(int i = -1; i <= 1; i++){
      for(int j = -1; j <= 1; j++){
        if(r+i > -1 && r+i < board[r].length && c+j > -1 && c+j < board[r].length){
          if(board[r + i][c + j].getStatus()){
            numArround++;
            // System.out.println("loop" +numArround-1);
          }
        }
      }
    }
    // System.out.println("original "+numArround);
    // System.out.println("-1" + numArround-1);
    return numArround-1;

  }




}
