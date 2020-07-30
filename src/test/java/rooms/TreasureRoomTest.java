package rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom(200);
    }

    @Test
    public void hasTreasure(){
        assertEquals(200, treasureRoom.allowToCollectTreasure());
    }

    @Test
    public void canSetTreasure(){
        treasureRoom.setTreasure(0);
        assertEquals(0, treasureRoom.allowToCollectTreasure());
    }



}
