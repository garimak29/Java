package LLD.StrategyPattern.GameExample.Characters;

import LLD.StrategyPattern.GameExample.WeaponBehaviours.KnifeBehaviour;

public class Queen extends Character {
    public Queen(){
        weaponBehaviour = new KnifeBehaviour();
    }
    public void display(){
        System.out.println("I am the queen ");
    }
}
