package playerclasses;

import character.Character;
import character.IArmoured;
import enemies.Enemy;
import treasure.ITreasure;
import treasure.Weapon;
import dungeon.Room;

import java.util.ArrayList;

public abstract class Player extends Character {

    private int strength;
    private int intelligence;
    private String name;
    private Race race;
    private Room room;
    private ArrayList<ITreasure> inventory;


    public Player(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race, Room room) {
        super(hitPoints, stamina, equippedWeapon);
        this.strength = strength;
        this.intelligence = intelligence;
        this.name = name;
        this.race = race;
        this.room = room;
        this.inventory = new ArrayList<>();
        this.inventory.add(equippedWeapon);
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

    public ArrayList<ITreasure> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<ITreasure> inventory) {
        this.inventory = inventory;
    }

    public void attack(Enemy target) {
        if (target instanceof IArmoured)  {
            int attackPower = getWeaponDamage() - ((IArmoured) target).getArmour();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
            if (target.getHitPoints() <= 0){
                target.setHitPoints(0);
                target.die(this.room);
            }
        } else {
            int attackPower = getWeaponDamage();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
            if (target.getHitPoints() <= 0){
                target.setHitPoints(0);
                target.die(this.room);
            }
        }
    }

    public void die(){
        this.getInventory().forEach(item -> room.getRoomTreasure().add(item));
    }

    public void lootRoom(Room room){

    }
}
