package LLD.StrategyPattern.GameExample.WeaponBehaviours;

public class KnifeBehaviour implements iWeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Knife");
    }
}
