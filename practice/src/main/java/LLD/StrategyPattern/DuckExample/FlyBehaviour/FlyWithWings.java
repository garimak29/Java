package LLD.StrategyPattern.DuckExample.FlyBehaviour;

public class FlyWithWings implements iFlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly !!!!");
    }
}
