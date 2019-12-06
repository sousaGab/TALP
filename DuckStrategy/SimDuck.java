import client.Duck;
import client.DecoyDuck;
import client.MallardDuck;
import client.ReadheadDuck;
import client.RubberDuck;
import quack.QuackBehavior;
import quack.MuteQuack;
import quack.Quack;
import quack.Squeack;
import fly.FlyBehavior;
import fly.FlyNoWay;
import fly.FlyWithWings;

public class SimDuck {

	public static void main (String[] args) {

		FlyBehavior flyWithWings = new FlyWithWings();
		FlyBehavior flyNoWay = new FlyNoWay();

		QuackBehavior quack = new Quack();
		QuackBehavior squeack = new Squeack();
		QuackBehavior muteQuack = new MuteQuack();
		
		Duck d1 = new DecoyDuck();
		Duck d2 = new MallardDuck();
		Duck d3 = new ReadheadDuck();
		Duck d4 = new RubberDuck();

		d1.setDuck(flyWithWings, quack);
		d2.setDuck(flyWithWings, quack);
		d3.setDuck(flyWithWings, squeack);
		d4.setDuck(flyNoWay, muteQuack);

		//Decoy
		d1.display();
		d1.swin();
		d1.performQuack();
		d1.performFly();

		System.out.println("");

		//Mallard
		d2.display();
		d2.swin();
		d2.performQuack();
		d2.performFly();

		System.out.println("");
		
		//ReadheadDuck
		d3.display();
		d3.swin();
		d3.performQuack();
		d3.performFly();

		System.out.println("");
		
		//RubberDuck
		d4.display();
		d4.swin();
		d4.performQuack();
		d4.performFly();
	}
}