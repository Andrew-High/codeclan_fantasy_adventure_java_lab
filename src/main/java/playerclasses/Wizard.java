package playerclasses;

import enemies.Enemy;
import spells.Spell;
import treasure.Weapon;

import java.util.ArrayList;

public class Wizard extends Player{

    private ArrayList<Spell> spellList;
    private Weapon weapon;

    public Wizard(String name, int hitPoints, int stamina, Weapon equippedWeapon, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, equippedWeapon, strength, intelligence, race);
        this.weapon = weapon;
        this.spellList = new ArrayList<Spell>();
    }


    public ArrayList<Spell> getSpellList() {
        return spellList;
    }

    public void setSpellList(ArrayList<Spell> spellList) {
        this.spellList = spellList;
    }

    public int countSpells() {
        return spellList.size();
    }

    public void addToSpellList(Spell spell) {
        spellList.add(spell);
    }

    public void cast(Spell spell, Enemy target) {
        int spellPower = spell.getPower() + this.getIntelligence()/5;
        int previousHitPoints = target.getHitPoints();
        int newHitPoints = previousHitPoints - spellPower;
        target.setHitPoints(newHitPoints);
    }

}
