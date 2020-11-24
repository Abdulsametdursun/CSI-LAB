public class Janitor extends Administrator{
  protected boolean sweeping;
  
  public Janitor (String empName, int empNumber, String dept, boolean sw){
    super (empName, empNumber, dept);
    sweeping = sw;
  }
  
  public void setIsSweeping (boolean isS){
    sweeping = isS;
  }
  
  public boolean getIsSweeping (){
    return sweeping;
  }
  
  public String toString (){
    return super.toString() + "\tSweeping: " + sweeping;
  }
  
  public void sweep(){
    System.out.print (name + " is");
    if (!sweeping)
      System.out.print (" not");
    System.out.println (" sweeping the floor.");
  }
}