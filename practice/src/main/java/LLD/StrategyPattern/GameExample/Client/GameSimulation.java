package LLD.StrategyPattern.GameExample.Client;

import LLD.StrategyPattern.GameExample.Characters.Character;
import LLD.StrategyPattern.GameExample.Characters.King;
import LLD.StrategyPattern.GameExample.WeaponBehaviours.AxeBehaviour;

import java.util.ArrayList;
import java.util.List;

public class GameSimulation {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeaponBehaviour(new AxeBehaviour());
        king.fight();
        List<Integer> abc = new ArrayList<>();

    }
}
