package LLD.StrategyPattern.DuckExample.TypesOfDucks;

import LLD.StrategyPattern.DuckExample.FlyBehaviour.FlyWithWings;
import LLD.StrategyPattern.DuckExample.QuakBehaviour.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quakIQuakBehaviour = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a mallard duck");
    }
}
