package LLD.DecoratorPattern.Beverages;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL)
            return beverage.cost() + 15;
        else if (getSize() == Size.GRANDE)
            return beverage.cost() + 25;
        else
            return beverage.cost() + 35;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Whip";
    }
}
