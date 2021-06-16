package enemies;

import spells.Spell;

import java.util.ArrayList;

public class Ogre extends Enemy{

    private ArrayList<Spell> spellList;

    public Ogre(int hitPoints, int stamina, ArrayList<Spell> spellList) {
        super(hitPoints, stamina);
        this.spellList = spellList;
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

}
