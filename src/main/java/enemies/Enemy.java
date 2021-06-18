package enemies;

import character.Character;
import character.IArmoured;
import treasure.ITreasure;
import treasure.Weapon;

import java.util.ArrayList;

public abstract class Enemy extends Character {

    private ArrayList<ITreasure> loot;

    public Enemy(int hitPoints, int stamina, Weapon weapon) {
        super(hitPoints, stamina, weapon);
        this.loot = new ArrayList<>();

    }

    public ArrayList<ITreasure> getLoot() {
        return loot;
    }

    public void setLoot(ArrayList<ITreasure> loot) {
        this.loot = loot;
    }

    public void attack(Character target) {
        if (target instanceof IArmoured)  {
            int attackPower = getWeaponDamage() - ((IArmoured) target).getArmour();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
        } else {
            int attackPower = getWeaponDamage();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
        }
    }

    public void addTreasureToLoot(ITreasure treasure){
        this.getLoot().add(treasure);
    }

}
