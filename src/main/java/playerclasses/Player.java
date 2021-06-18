package playerclasses;

import character.Character;
import character.IArmoured;
import enemies.Enemy;
import treasure.Weapon;
import dungeon.Room;

public abstract class Player extends Character {

    private int strength;
    private int intelligence;
    private String name;
    private Race race;
    private Room room;


    public Player(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race, Room room) {
        super(hitPoints, stamina, equippedWeapon);
        this.strength = strength;
        this.intelligence = intelligence;
        this.name = name;
        this.race = race;
        this.room = room;
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

    public void attack(Enemy target) {
        if (target instanceof IArmoured)  {
            int attackPower = getWeaponDamage() - ((IArmoured) target).getArmour();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
            if (target.getHitPoints() <= 0){
                target.die(this.room);
            }
        } else {
            int attackPower = getWeaponDamage();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
            if (target.getHitPoints() <= 0){
                target.die(this.room);
            }
        }
    }

    public void lootRoom(Room room){

    }
}
