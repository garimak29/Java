package LLD.StrategyPattern.GameExample.Characters;

import LLD.StrategyPattern.GameExample.WeaponBehaviours.BowAndArrowBehaviour;

public class King extends Character {
    public King(){
        weaponBehaviour = new BowAndArrowBehaviour();
    }
    public void display(){
        System.out.println("I am the king of the world ... hahahahahha");
    }
}
