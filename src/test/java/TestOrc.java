import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import playerclasses.Fighter;
import playerclasses.Knight;
import playerclasses.Race;
import treasure.Weapon;
import treasure.WeaponType;

import static org.junit.Assert.assertEquals;

public class TestOrc {

    private Orc orc;
    private Fighter fighter;
    private Weapon longsword;
    private Weapon axe;
    private Knight knight;

    @Before
    public void setUp(){
        longsword = new Weapon(WeaponType.LONGSWORD);
        axe = new Weapon(WeaponType.AXE);
        orc = new Orc(100,100, axe);
        fighter = new Fighter("Trogdor", 100,100, longsword, 20,10, Race.HUMAN);
        knight = new Knight("chuck", 100, 100, axe, 15, 15, Race.HALFLING, 5, );

    }


    @Test
    public void orcCanAttack(){
        orc.attack(fighter);
        assertEquals(90, fighter.getHitPoints());
    }

    @Test
    public void attacksAccountForArmour(){
        orc.attack(knight);
        assertEquals(95, knight.getHitPoints());
    }
}
