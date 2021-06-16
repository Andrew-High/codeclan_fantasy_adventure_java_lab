package enemies;

import character.Character;
import character.IArmoured;
import treasure.Weapon;

public abstract class Enemy extends Character {
    public Enemy(int hitPoints, int stamina, Weapon weapon) {
        super(hitPoints, stamina, weapon);
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

}
