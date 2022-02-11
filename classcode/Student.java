public class Student{
//fields, instance variables
  //private meaning that it can only be accessed in this class
  private int id;
  private String name;
  private boolean cc;
  private int[] grades;

//constructor(name of constructor matches the class name)
public void Student(int id, String n, boolean cc, int[] g){
  this.id = id;
  this.name = n;
  this.cc = cc;
  this.grades = g;
}

public double getAverage(){
  int total = 0;
  for(int grade : this.grades){
    total+= grade;
  }
  return total / grades.length;
}



// behaviors(methods)
//get the close contact status of the student
public boolean getCC(){
  return this.cc;

}//end getCC method

//set the value of cc
public void setCC(boolean value){

}//end setCC method

//see if the student is failing
public boolean isFailing(){
  return true;
}//end isFailing method

//get the String value of the objects
public String getName(){
  return this.name;
}//end getName method

}
