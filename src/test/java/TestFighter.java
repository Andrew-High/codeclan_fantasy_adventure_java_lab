import dungeon.Room;
import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Fighter;
import playerclasses.Race;
import enemies.Ogre;
import treasure.Weapon;
import treasure.WeaponType;

import static org.junit.Assert.assertEquals;

public class TestFighter {

    private Fighter character;
    private Ogre ogre;
    private Weapon weapon;
    private Room room;

    @Before
    public void setUp(){
        weapon = new Weapon(WeaponType.AXE);
        room = new Room();
        character = new Fighter("Trogdor", 100,100, weapon, 20,10, Race.HUMAN, room);
        ogre = new Ogre(100,100, weapon);
    }

    @Test
    public void characterHasHitpoints(){
        assertEquals(100, character.getHitPoints());
    }

    @Test
    public void characterHasStamina(){
        assertEquals(100, character.getStamina());
    }

    @Test
    public void characterIsAHuman(){
        assertEquals(Race.HUMAN, character.getRace());
    }

    @Test
    public void characterHasStrength(){
        assertEquals(20, character.getStrength());
    }

    @Test
    public void characterHasIntelligence(){
        assertEquals(10, character.getIntelligence());
    }

    @Test
    public void characterHasAName(){
        assertEquals("Trogdor", character.getName());
    }

    @Test
    public void characterCanAttack(){
        character.attack(ogre);
        assertEquals(86, ogre.getHitPoints());
    }

    @Test
    public void canDie(){
        room.addToEnemies(ogre);
        character.setHitPoints(1);
        ogre.attack(character);
        assertEquals(0, character.getHitPoints());
        assertEquals(1, room.getRoomTreasure().size());
        assertEquals(1, room.getDeadPlayers().size());
    }



}
