package LLD.StrategyPattern.GameExample.WeaponBehaviours;

public class SwordBehaviour implements iWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Sword");
    }
}
