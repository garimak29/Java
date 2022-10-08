package LLD.DecoratorPattern.Beverages;

// if you want to add on stuff which should not make your class bulky
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " Milk";
    }

    public double cost() {
        if (getSize() == Size.TALL)
            return beverage.cost() + 10;
        else if (getSize() == Size.GRANDE)
            return beverage.cost() + 20;
        else
            return beverage.cost() + 30;
    }

}
