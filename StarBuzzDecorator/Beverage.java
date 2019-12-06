public abstract class Beverage {
  String description = "Unknown Beverage";
  
  public String getDescription() {
    return description; 
  }  

  public abstract double cost();

  public void show(){
    System.out.print(getDescription());
    int s = getDescription().length();
    for(int i=s;i<90;++i)
      System.out.print(".");
     System.out.println(" $"+cost());  
  }

}
