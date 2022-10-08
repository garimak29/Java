package LLD.DecoratorPattern.Beverages;

//concrete class
public class HouseBlend extends Beverage{
      @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 10;
    }
}
