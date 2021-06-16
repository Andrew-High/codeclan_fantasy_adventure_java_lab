package playerclasses;

import spells.Spell;

import java.util.ArrayList;

public class Wizard extends Player{

    private ArrayList<Spell> spellList;

    public Wizard(String name, int hitPoints, int stamina, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, strength, intelligence, race);
        spellList = new ArrayList<Spell>();
    }
}
