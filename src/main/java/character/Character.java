package character;

import enemies.Enemy;
import treasure.*;

import java.util.ArrayList;

public abstract class Character {
    private int hitPoints;
    private int stamina;
    private Weapon equippedWeapon;
    private ArrayList<ITreasure> inventory;

    public Character(int hitPoints, int stamina, Weapon equippedWeapon) {
        this.hitPoints = hitPoints;
        this.stamina = stamina;
        this.equippedWeapon = equippedWeapon;
        this.inventory = new ArrayList<>();
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public abstract void attack(Character target);

    public int getWeaponDamage(){
        return this.equippedWeapon.getDamageFromEnum();
    }



}
