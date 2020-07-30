package players;

import armory.PlateArmour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    PlateArmour plateArmour;

    @Before
    public void before(){
        plateArmour = new PlateArmour(20);
        knight = new Knight("Lancelot", 200, 10, plateArmour);
    }

    @Test
    public void armourIncreasesHp(){
        knight.takeDamage(20);
        assertEquals(200, knight.getHealthPoints());
    }

}
