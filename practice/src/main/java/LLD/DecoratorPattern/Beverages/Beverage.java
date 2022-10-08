package LLD.DecoratorPattern.Beverages;

// main concrete class
public abstract class Beverage{
    public enum Size{TALL , GRANDE , VENTI};
    Size size = Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract String getDescription();
   public abstract double cost();

    ;

}
