public class StarbuzzCoffee {

  public static void main(String[] args) {

    Beverage beverage1 = new Expresso();  
    beverage1.show();

    Beverage beverage2 = new DarkRoast();  
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    beverage2.show();

    Beverage beverage3 = new HouseBlend();  
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    beverage3.show();

  }
}
