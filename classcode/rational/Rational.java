public class Rational{
  private int n;
  private int d;

  public Rational(int num, int den){
    this.n = num;
    this.d = den;
  }
  public Rational(){
    this.n = 0;
    this.d = 1;
  }

  public void printRational(){
    System.out.println(n + "/" + d);
  }

  public String toString(){
    return ;
  }
  public void negate(){
    this.n *= -1;

  }
  public void invert(int num, int den){
    this.n = den;
    this.d = num;

  }
  public double toDouble(){
    
  }
}
