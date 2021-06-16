import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Fighter;
import playerclasses.Race;
import treasure.Weapon;
import treasure.WeaponType;

import static org.junit.Assert.assertEquals;

public class TestOrc {

    private Orc orc;
    private Fighter fighter;
    private Weapon longsword;
    private Weapon axe;

    @Before
    public void setUp(){
        longsword = new Weapon(WeaponType.LONGSWORD);
        axe = new Weapon(WeaponType.AXE);
        orc = new Orc(100,100, axe);
        fighter = new Fighter("Trogdor", 100,100, longsword, 20,10, Race.HUMAN);

    }


    @Test
    public void orcCanAttack(){
        orc.attack(fighter);
        assertEquals(90, fighter.getHitPoints());
    }
}
