public class PizzaTestDrive {
  public static void main(String[] args) {

    PizzaStore nyPizza = new NYPizzaStore();

    //example
    Pizza pizza = nyPizza.orderPizza("greek");
    System.out.println("Ethan ordered a "+ pizza.getName());

  }
}
