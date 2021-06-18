import dungeon.Dungeon;
import dungeon.Room;
import enemies.Orc;
import org.junit.Before;
import playerclasses.Fighter;
import playerclasses.Race;
import treasure.Weapon;
import treasure.WeaponType;

public class TestDungeon {

    @Before
    public void setUp(){
        Dungeon dungeon = new Dungeon();
        Room room = new Room();
        dungeon.populateLootList();
        dungeon.distributeLootToEnemies();
        Weapon weapon = new Weapon(WeaponType.AXE);
        Fighter fighter = new Fighter("Thorold", 100, 100, weapon, 20, 10, Race.DWARF, room);
        Orc orc = new Orc(100, 100, weapon);

    }
}
