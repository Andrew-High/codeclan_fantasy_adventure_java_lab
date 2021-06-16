import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Cleric;
import playerclasses.Race;
import playerclasses.Wizard;
import spells.Element;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class TestCleric {

    private Cleric cleric;
    private Spell cureLightWounds;
    private Wizard wizard;
    private Spell fireball;
    private Ogre ogre;

    @Before
    public void setUp(){
        cleric = new Cleric("sir healbot", 50,50, 15,15, Race.DWARF);
        cureLightWounds = new Spell(Element.HEALING, 10);
        wizard = new Wizard("Harry", 100, 100, 10, 20, Race.HUMAN);
        fireball = new Spell(Element.FIRE, 10);
        ogre = new Ogre(100,100);

    }

    @Test
    public void ClericCanAddToSpellList(){
        cleric.addToSpellList(cureLightWounds);
        assertEquals(1, cleric.countSpells());
    }

    @Test
    public void aClericCanHealPartyMembers(){
        cleric.addToSpellList(cureLightWounds);
        ogre.cast(fireball,wizard);
        cleric.cast(cureLightWounds,wizard);
        assertEquals(100, wizard.getHitPoints());
    }
}
