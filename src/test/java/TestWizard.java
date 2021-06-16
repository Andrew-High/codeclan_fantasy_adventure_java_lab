import enemies.Enemy;
import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Race;
import playerclasses.Wizard;
import spells.Element;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class TestWizard {

    private Wizard wizard;
    private Spell spell;
    private Ogre ogre;

    @Before
    public void setUp(){
        wizard = new Wizard("Harry", 100, 100, 10, 20, Race.HUMAN);
        spell = new Spell(Element.FIRE, 10);
        ogre = new Ogre(100,100);
    }

    @Test
    public void wizardStartsWithEmptySpellList(){
        assertEquals(0, wizard.countSpells());
    }

    @Test
    public void wizardCanAddToSpellList(){
        wizard.addToSpellList(spell);
        assertEquals(1, wizard.countSpells());
    }

    @Test
    public void wizardCanCastSpells(){
        wizard.addToSpellList(spell);
        wizard.cast(spell, ogre);
        wizard.cast(spell, ogre);
        assertEquals(80, ogre.getHitPoints());


    }





}
