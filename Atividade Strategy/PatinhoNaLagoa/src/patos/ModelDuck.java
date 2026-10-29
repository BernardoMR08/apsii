package patos;

import quacks.Quack;
import voos.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Sou um pato de modelo!");
    }
}
