package strategy.duck;

import strategy.duck.fly.FlyBehavior;
import strategy.duck.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior; //object composition
    QuackBehavior quackBehavior; //object composition

    public Duck() {
    }

    public abstract void display();

    // delegation
    public void performFly() {
        flyBehavior.fly();
    }

    // delegation
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
