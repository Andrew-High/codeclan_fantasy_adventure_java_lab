import dungeon.Room;
import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Cleric;
import playerclasses.Knight;
import playerclasses.Race;
import playerclasses.Wizard;
import spells.Element;
import spells.Spell;
import treasure.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    private Room room1;
    private ArrayList<ITreasure> roomTreasure;
    private ArrayList<Enemy> enemies;
    private Cleric cleric;
    private Spell cureLightWounds;
    private Wizard wizard;
    private Spell fireball;
    private Orc orc;
    private Gold gold;
    private Gem gem;
    private Weapon weapon;
    private Weapon wand;
    private Knight knight;

    @Before
    public void setUp(){
        room1 = new Room();
        weapon = new Weapon(WeaponType.AXE);
        knight = new Knight("chuck", 100, 100, weapon, 15, 15, Race.HALFLING, 5, room1);
        wand = new Weapon(WeaponType.WAND);
        cleric = new Cleric("sir healbot", 50,50,weapon, 15,15, Race.DWARF, room1);
        cureLightWounds = new Spell(Element.HEALING, 10);
        wizard = new Wizard("Harry", 100, 100, wand, 10, 20, Race.HUMAN, room1);
        fireball = new Spell(Element.FIRE, 10);
        orc = new Orc(100,100, weapon);
        gold = new Gold();
        gem = new Gem();

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
        room1.addToEnemies(orc);
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
