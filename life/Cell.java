public class Cell{
  private String[][] grid;
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
  public Cell(String[][] g, boolean s, int t){
    this.grid = g;
    this.status = s;
    this.turn = t;
  }



}
