package players;

import healingTools.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    Barbarian barbarian;

    @Before
    public void before(){
        cleric = new Cleric("Arwen", 200, 0);
        barbarian = new Barbarian("Conan", 500, 0);
        potion = new Potion(10);
    }

    @Test
    public void hasName(){
        assertEquals("Arwen", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, cleric.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, cleric.getTreasureChest());
    }

    @Test
    public void hasItemsInArmory(){
        cleric.addToolToHealingTools(potion);
        assertEquals(1, cleric.countTools());
    }

    @Test
    public void canHeal(){
        cleric.heal(potion, barbarian);
        assertEquals(510, barbarian.getHealthPoints());
    }
}
