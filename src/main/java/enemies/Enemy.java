package enemies;

import character.Character;
import treasure.Weapon;

public abstract class Enemy extends Character {
    public Enemy(int hitPoints, int stamina, Weapon weapon) {
        super(hitPoints, stamina, weapon);
    }


    public void attack(Character target) {
        int attackPower = getWeaponDamage();
        int previousHitPoints = target.getHitPoints();
        int newHitPoints = previousHitPoints - attackPower;
        target.setHitPoints(newHitPoints);
    }

}
