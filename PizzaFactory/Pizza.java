import java.util.ArrayList;

public abstract class Pizza {

  String name;
  String dough;
  String sauce;
  ArrayList toppings = new ArrayList();

  public void prepare() {
    System.out.println("Preparing the pizza "+ name);
    System.out.println("Adding toppings : ");
    for(int i=0;i<toppings.size();++i)
      System.out.print(" "+toppings.get(i));
    System.out.println("");
  }
  public void bake() {
    System.out.println("Bake the pizza for 25 minutes at 305");
  }
  public void cut() {
    System.out.println("Cutting the pizza");
  }
  public void box() {
    System.out.println("Boxing the pizza");
  }

  public String getName() {
    return name;
  }

}
