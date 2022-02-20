package LLD.StrategyPattern.DuckExample.TypesOfDucks;

import LLD.StrategyPattern.DuckExample.FlyBehaviour.FlyNoWay;
import LLD.StrategyPattern.DuckExample.QuakBehaviour.Squeak;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quakIQuakBehaviour = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("I am a model duck");
    }
}
