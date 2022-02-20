package LLD.StrategyPattern.GameExample.Characters;

import LLD.StrategyPattern.GameExample.WeaponBehaviours.AxeBehaviour;

public class Troll  extends Character{
    public Troll(){
        weaponBehaviour = new AxeBehaviour();
    }
    public void display(){
        System.out.println("I am the troll , no one can stand against me");
    }
}
