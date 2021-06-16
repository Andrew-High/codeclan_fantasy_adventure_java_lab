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

    @Before
    public void setUp(){
        wizard = new Wizard("Harry", 100, 100, 10, 20, Race.HUMAN);
        spell = new Spell(Element.FIRE, 10);
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





}
