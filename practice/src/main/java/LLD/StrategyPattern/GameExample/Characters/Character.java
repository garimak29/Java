package LLD.StrategyPattern.GameExample.Characters;

import LLD.StrategyPattern.GameExample.WeaponBehaviours.iWeaponBehaviour;

public abstract class Character {
    iWeaponBehaviour weaponBehaviour= null;

    public void setWeaponBehaviour(iWeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
    public void fight(){
        weaponBehaviour.useWeapon();
    }
}
