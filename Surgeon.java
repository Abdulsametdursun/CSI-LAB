public class Surgeon extends Doctor{
  protected boolean operating;

  public Surgeon (String empName, int empNumber, String special, boolean isOper){
    super (empName, empNumber, special);
    operating = isOper;
  }

  public void setIsOperating (boolean isOper){
    operating = isOper;
  }

  public boolean getIsOperating(){
    return operating;
  }

  public String toString(){
    return super.toString() + "\tOperating: " + operating;
  }

  public void operate(){
    System.out.print (name + " is");
    if (!operating)
      System.out.print (" not");
    System.out.println (" operating now.");
  }
}