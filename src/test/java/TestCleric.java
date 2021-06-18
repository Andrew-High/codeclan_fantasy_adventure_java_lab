import dungeon.Room;
import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Cleric;
import playerclasses.Race;
import playerclasses.Wizard;
import spells.Element;
import spells.Spell;
import treasure.Weapon;
import treasure.WeaponType;

import static org.junit.Assert.assertEquals;

public class TestCleric {

    private Cleric cleric;
    private Spell cureLightWounds;
    private Wizard wizard;
    private Spell fireball;
    private Ogre ogre;
    private Weapon weapon;
    private Weapon wand;
    private Room room;

    @Before
    public void setUp(){
        wand = new Weapon(WeaponType.WAND);
        weapon = new Weapon(WeaponType.MACE);
        room = new Room();
        cleric = new Cleric("sir healbot", 50,50,weapon, 15,15, Race.DWARF, room);
        cureLightWounds = new Spell(Element.HEALING, 10);
        wizard = new Wizard("Harry", 100, 100, wand, 10, 20, Race.HUMAN, room);
        fireball = new Spell(Element.FIRE, 10);
        ogre = new Ogre(100,100, weapon);

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
