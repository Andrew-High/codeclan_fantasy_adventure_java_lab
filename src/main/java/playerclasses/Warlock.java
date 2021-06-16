package playerclasses;

import spells.Spell;

import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<Spell> spellList;

    public Warlock(String name, int hitPoints, int stamina, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, strength, intelligence, race);
        spellList = new ArrayList<Spell>();
    }
}
