package playerclasses;

import java.util.ArrayList;
import spells.Spell;

public class Cleric extends Player {

    private ArrayList<Spell> spellList;

    public Cleric(String name, int hitPoints, int stamina, int strength, int intelligence, Race race) {
        super(name, hitPoints, stamina, strength, intelligence, race);
        spellList = new ArrayList<Spell>();
    }
}
