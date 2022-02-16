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
  public int getDen(){
    return this.d;

  }
  public int getNum(){
    return this.n;

  }

  public void printRational(){
    System.out.println(n + "/" + d);
  }

  public String toString(){
    return n + "/" + d;
  }
  public void negate(){
    this.n *= -1;

  }
  public void invert(int num, int den){
    this.n = den;
    this.d = num;

  }
  public double toDouble(){
    return this.n / this.d;

  }
  public void reduce(int num,int den){
    int gcf = 1;
    for (int i = 2; i<=num && i<=den; i++){
      if (num%i == 0 && den%i == 0){
        gcf = i;
      }
    }
    num = num/gcf;
    den = den/gcf;
    System.out.println(num + "/" + den);
  }
  
  public void add(Rational two){
    int commonDen = (this.d*two.getDen());
    int num = (this.n*two.getDen())+(two.getNum()*this.d);
    reduce(num,commonDen);


  }


}
