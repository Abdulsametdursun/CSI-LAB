public class Receptionist extends Administrator{
  protected boolean answering;

  public Receptionist (String empName, int empNumber, String dept, boolean ans){
    super (empName, empNumber, dept);
    answering = ans;
  }

  public void setIsAnswering (boolean isA){
    answering = isA;
  }

  public boolean getIsAnswering(){
    return answering;
  }

  public String toString(){
    return super.toString() + "\tAnswering: " + answering;
  }

  public void answer(){
    System.out.print (name + " is");
    if (!answering)
      System.out.print (" not");
    System.out.println (" answering the phone.");
  }
}