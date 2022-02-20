package LLD.StrategyPattern.GameExample.Characters;

import LLD.StrategyPattern.GameExample.WeaponBehaviours.SwordBehaviour;

public class Knight extends Character {
    public Knight(){
        weaponBehaviour = new SwordBehaviour();
    }

    public void display(){
        System.out.println("I am the knight!! I will protect my King");
    }
}
