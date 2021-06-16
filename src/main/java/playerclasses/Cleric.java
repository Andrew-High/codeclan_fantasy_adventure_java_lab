package playerclasses;

import java.util.ArrayList;

import enemies.Enemy;
import spells.Spell;
import treasure.Weapon;

public class Cleric extends Player {

    private ArrayList<Spell> spellList;

    public Cleric(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, equippedWeapon, strength, intelligence, race);
        this.spellList = new ArrayList<>();
    }


    public int countSpells() {
        return spellList.size();
    }

    public void addToSpellList(Spell spell) {
    spellList.add(spell);
    }

    public void cast(Spell spell, Player target) {
        int spellPower = spell.getPower();
        int previousHitPoints = target.getHitPoints();
        int newHitPoints = previousHitPoints + spellPower;
        target.setHitPoints(newHitPoints);
    }
}
