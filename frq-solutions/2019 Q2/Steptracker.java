public class Steptracker{
  private int numDays;
  private int totalDays;
  private int stepLimit;
  private int numSteps;
  public Steptracker(int track){
    this.stepLimit = track;
    this.numDays = 0;
    this.totalDays = 0;
    this.numSteps = 0;
  }
  public void addDailySteps(int steps){
    if(steps >= stepLimit){
      this.numDays++;
    }
    this.numSteps += steps;
    this.totalDays++;
  }
  public int activeDays(){
    return this.numDays;
  }
  public double averageSteps(){
    if(totalDays == 0){
      return 0.0;
    }
    else{
      return (double)this.numSteps/this.totalDays;
    }
  }




}
