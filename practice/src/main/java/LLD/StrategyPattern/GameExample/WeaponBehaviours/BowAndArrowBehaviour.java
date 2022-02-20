package LLD.StrategyPattern.GameExample.WeaponBehaviours;

public class BowAndArrowBehaviour implements iWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow");
    }
}
