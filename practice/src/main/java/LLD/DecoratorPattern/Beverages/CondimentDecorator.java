package LLD.DecoratorPattern.Beverages;

import LLD.DecoratorPattern.Beverages.Beverage;

//decorator class
// pass the main concrete class here
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public CondimentDecorator(Beverage beverage ){
        this.beverage = beverage;

    }

    public  String getDescription(){
       return getDescription()+" TALL";
    }
    public  double cost(){
        return cost()+10;
    }



}
