package playerclasses;

import dungeon.Room;
import treasure.Weapon;

public class Fighter extends Player {

    public Fighter(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race, Room room) {
        super(name, hitPoints, stamina, equippedWeapon, strength, intelligence, race, room);
    }
}
