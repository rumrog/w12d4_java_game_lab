package enemies;

import armory.Armory;
import armory.Club;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Player;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Club club;
    Player player;

    @Before
    public void before(){
        club =new Club(5);
        orc = new Orc("Kebub", 20);
        player = new Barbarian("Conan", 500, 0);

    }

    @Test
    public void hasName(){
        assertEquals("Kebub", orc.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, orc.checkHealth());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(10);
        assertEquals(10, orc.checkHealth());
    }

    @Test
    public void canAddWeapon(){
        orc.addWeapon(club);
        assertEquals(1, orc.countWeapons());
    }

//    @Test
//    public void canAttack(){
//        orc.attack(club, player);
//        assertEquals(495, player.getHealthPoints());
//    }

}
