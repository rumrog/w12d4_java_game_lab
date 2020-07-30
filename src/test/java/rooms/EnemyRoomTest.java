package rooms;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Enemy orc;

    @Before
    public void before(){
        orc = orc = new Orc("Kebub", 20);
        enemyRoom = new EnemyRoom();
    }

    @Test
    public void canAddEnemyToRoom(){
        enemyRoom.addEnemyToRoom(orc);
        assertEquals(1, enemyRoom.countEnemies());
    }

}
