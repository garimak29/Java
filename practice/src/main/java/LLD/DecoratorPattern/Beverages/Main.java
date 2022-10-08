package LLD.DecoratorPattern.Beverages;


public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription());
        beverage = new Whip(new Milk(beverage));
        System.out.println(beverage.getDescription()+" - "+beverage.cost());
        Beverage beverage1 = new Expresso();
        beverage1.setSize(Beverage.Size.TALL);
       beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription()+" - "+beverage1.cost());
       beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" - "+beverage1.cost());

    }
}
