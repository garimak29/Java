package LLD.StrategyPattern.DuckExample.client;

import LLD.StrategyPattern.DuckExample.FlyBehaviour.FlyWithWings;
import LLD.StrategyPattern.DuckExample.TypesOfDucks.Duck;
import LLD.StrategyPattern.DuckExample.TypesOfDucks.MallardDuck;
import LLD.StrategyPattern.DuckExample.TypesOfDucks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        // just setting the behaviour
        modelDuck.setFlyBehavior(new FlyWithWings());
        // printing the output
        modelDuck.performFly();
    }
}
