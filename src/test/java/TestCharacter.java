import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCharacter {

    private Character character;

    @Before
    public void setUp(){
        character = new Character(100);
    }

    @Test
    public void characterHasHitpoints(){
        assertEquals(100, character.getHitPoints());
    }


}
