package LLD.DecoratorPattern.Beverages;

// concrete class
public class Expresso extends Beverage{

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double cost() {
        return 40;
    }
}
