package playerclasses;

import enemies.Enemy;
import spells.Spell;

import java.util.ArrayList;

public class Wizard extends Player{

    private ArrayList<Spell> spellList;

    public Wizard(String name, int hitPoints, int stamina, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, strength, intelligence, race);
        spellList = new ArrayList<Spell>();
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
        int spellPower = spell.getPower();
        int previousHitPoints = target.getHitPoints();
        int newHitPoints = previousHitPoints - spellPower;
        target.setHitPoints(newHitPoints);
    }

}
