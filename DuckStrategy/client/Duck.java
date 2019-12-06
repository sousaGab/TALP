package client;

import quack.QuackBehavior;
import fly.FlyBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();

	public void setDuck (FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public void swin () {
		System.out.println("Swiming!");
	}

	public void performQuack () {
		quackBehavior.quack();
	}

	public void performFly () {
		flyBehavior.fly();
	}
}