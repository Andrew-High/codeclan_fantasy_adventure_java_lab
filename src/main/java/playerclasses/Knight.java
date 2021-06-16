package playerclasses;

import character.IArmoured;
import treasure.Weapon;

public class Knight extends Player implements IArmoured {

    private int armour;

    public Knight(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race, int armour) {
        super(name, hitPoints, stamina, equippedWeapon, strength, intelligence, race);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }
}
