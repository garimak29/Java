package LLD.StrategyPattern.DuckExample.QuakBehaviour;

public class Squeak implements iQuakBehaviour{
    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }
}
