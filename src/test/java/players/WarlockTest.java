package players;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Fireball fireball;
    Orc orc;

    @Before
    public void before(){
        fireball = new Fireball(15);
        warlock = new Warlock("Saruman", 200, 0);
        orc = new Orc("Kebub", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Saruman", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, warlock.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, warlock.getTreasureChest());
    }

    @Test
    public void hasItemsInArmory(){
        warlock.addSpellToSpells(fireball);
        assertEquals(1, warlock.countSpells());
    }

    @Test
    public void canAttack(){
        warlock.attack(fireball, orc);
        assertEquals(5, orc.checkHealth());
    }
}
