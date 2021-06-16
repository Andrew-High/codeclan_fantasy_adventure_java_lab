package playerclasses;

import character.Character;
import treasure.Weapon;
import dungeon.Room;

public abstract class Player extends Character {

    private int strength;
    private int intelligence;
    private String name;
    private Race race;


    public Player(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence,  Race race) {
        super(hitPoints, stamina, equippedWeapon);
        this.strength = strength;
        this.intelligence = intelligence;
        this.name = name;
        this.race = race;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public void attack(Character target) {
        int attackPower = getWeaponDamage() + this.getStrength() / 5;
        int previousHitPoints = target.getHitPoints();
        int newHitPoints = previousHitPoints - attackPower;
        target.setHitPoints(newHitPoints);
    }

    public void lootRoom(Room room){

    }
}
