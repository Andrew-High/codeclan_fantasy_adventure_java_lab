package enemies;

import character.Character;
import character.IArmoured;
import dungeon.Room;
import playerclasses.Player;
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

    public void attack(Player target) {
        if (target instanceof IArmoured)  {
            int attackPower = getWeaponDamage() - ((IArmoured) target).getArmour();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
            if (target.getHitPoints() <= 0){
                target.setHitPoints(0);
                target.die();
            }
        } else {
            int attackPower = getWeaponDamage();
            int previousHitPoints = target.getHitPoints();
            int newHitPoints = previousHitPoints - attackPower;
            target.setHitPoints(newHitPoints);
            if (target.getHitPoints() <= 0){
                target.setHitPoints(0);
                target.die();
                target.getRoom().getDeadPlayers().add(target);
            }
        }
    }

    public void addTreasureToLoot(ITreasure treasure){
        this.getLoot().add(treasure);
    }

    public void die(Room room){
        this.getLoot().forEach(treasure -> room.getRoomTreasure().add(treasure));
    }

}
