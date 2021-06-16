package enemies;

import playerclasses.Fighter;
import playerclasses.Player;
import spells.Spell;

import java.util.ArrayList;

public class Ogre extends Enemy{

    private ArrayList<Spell> spellList;

    public Ogre(int hitPoints, int stamina) {
        super(hitPoints, stamina);
        this.spellList = new ArrayList<>();
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

    public void cast(Spell spell, Player player) {
        int spellPower = spell.getPower();
        int previousHitPoints = player.getHitPoints();
        int newHitPoints = previousHitPoints - spellPower;
        player.setHitPoints(newHitPoints);
    }
}
