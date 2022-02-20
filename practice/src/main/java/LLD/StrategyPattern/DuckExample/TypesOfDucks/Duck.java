package LLD.StrategyPattern.DuckExample.TypesOfDucks;

import LLD.StrategyPattern.DuckExample.FlyBehaviour.iFlyBehavior;
import LLD.StrategyPattern.DuckExample.QuakBehaviour.iQuakBehaviour;

public abstract class Duck {
    iFlyBehavior flyBehavior = null;
    iQuakBehaviour quakIQuakBehaviour = null;

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quakIQuakBehaviour.quack();
    }
    
    // setting behaviour dynamically 


    public void setFlyBehavior(iFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuakIQuakBehaviour(iQuakBehaviour quakIQuakBehaviour) {
        this.quakIQuakBehaviour = quakIQuakBehaviour;
    }
}
