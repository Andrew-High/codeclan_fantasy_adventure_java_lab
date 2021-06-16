import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Fighter;
import playerclasses.Race;
import spells.Element;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class TestOgre {

    private Ogre ogre;
    private Spell spell;
    private Fighter fighter;

    @Before
    public void setUp(){
        fighter = new Fighter("Trogdor",100, 100,20,10, Race.HUMAN);
        ogre = new Ogre(100,100);
        spell = new Spell(Element.FIRE, 10);
    }

    @Test
    public void ogreStartsWithEmptySpellList(){
        assertEquals(0, ogre.countSpells());
    }

    @Test
    public void ogreCanAddToSpellList(){
        ogre.addToSpellList(spell);
        assertEquals(1, ogre.countSpells());
    }

    @Test
    public void ogreCanCastSpell(){
        ogre.addToSpellList(spell);
        ogre.cast(spell, fighter);
        assertEquals(90, fighter.getHitPoints());
    }

}
