package LLD.StrategyPattern.DuckExample.FlyBehaviour;

public class FlyNoWay implements iFlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
