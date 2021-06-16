import dungeon.Room;
import enemies.Enemy;
import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Cleric;
import playerclasses.Race;
import playerclasses.Wizard;
import spells.Element;
import spells.Spell;
import treasure.*;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    private Room room1;
    private ArrayList<ITreasure> roomTreasure;
    private ArrayList<Enemy> enemies;
    private Cleric cleric;
    private Spell cureLightWounds;
    private Wizard wizard;
    private Spell fireball;
    private Ogre ogre;
    private Gold gold;
    private Gem gem;
    private Weapon weapon;
    private Weapon wand;

    @Before
    public void setUp(){
        room1 = new Room();
        wand = new Weapon(WeaponType.WAND);
        cleric = new Cleric("sir healbot", 50,50,weapon, 15,15, Race.DWARF);
        cureLightWounds = new Spell(Element.HEALING, 10);
        wizard = new Wizard("Harry", 100, 100, wand, 10, 20, Race.HUMAN);
        fireball = new Spell(Element.FIRE, 10);
        ogre = new Ogre(100,100, weapon);
        gold = new Gold();
        gem = new Gem();
        weapon = new Weapon(WeaponType.AXE);
    }

    @Test
    public void roomStartsEmpty(){
        int treasureCount = room1.getRoomTreasure().size();
        int roomEnemies = room1.getEnemies().size();
        int roomContents = treasureCount + roomEnemies;
        assertEquals(0, roomContents);
    }

    @Test
    public void roomCanAddToEnemies(){
        room1.addToEnemies(ogre);
        assertEquals(1, room1.getEnemies().size());
    }

    @Test
    public void roomCanAddToGoldToTreasure(){
        room1.addToTreasure(gold);
        assertEquals(1, room1.getRoomTreasure().size());
    }

    @Test
    public void roomCanAddLotsToTreasure(){
        room1.addToTreasure(gold);
        room1.addToTreasure(gold);
        room1.addToTreasure(gold);
        room1.addToTreasure(gold);
        room1.addToTreasure(gem);
        room1.addToTreasure(gem);
        assertEquals(6, room1.getRoomTreasure().size());
    }

    @Test
    public void roomCanAddWeaponToTreasure(){
        room1.addToTreasure(weapon);
        assertEquals(1, room1.getRoomTreasure().size());
    }
}
