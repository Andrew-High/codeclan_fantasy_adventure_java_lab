package playerclasses;

import spells.Spell;
import treasure.Weapon;

import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<Spell> spellList;

    public Warlock(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, equippedWeapon, strength, intelligence, race);
        this.spellList = new ArrayList<Spell>();
    }



}
