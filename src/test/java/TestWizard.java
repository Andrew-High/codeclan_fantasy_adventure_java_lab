import enemies.Enemy;
import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Race;
import playerclasses.Wizard;
import spells.Element;
import spells.Spell;
import treasure.Weapon;
import treasure.WeaponType;

import static org.junit.Assert.assertEquals;

public class TestWizard {

    private Wizard wizard;
    private Spell spell;
    private Ogre ogre;
    private Weapon wand;
    private Weapon weapon;

    @Before
    public void setUp(){
        weapon = new Weapon(WeaponType.AXE);
        wand = new Weapon(WeaponType.WAND);
        wizard = new Wizard("Harry", 100, 100, wand, 10, 20, Race.HUMAN);
        spell = new Spell(Element.FIRE, 10);
        ogre = new Ogre(100,100, weapon);
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
        assertEquals(72, ogre.getHitPoints());


    }





}
