package strategy.duck.quack.impl;

import strategy.duck.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
