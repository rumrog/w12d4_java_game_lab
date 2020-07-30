package rooms;

import players.Player;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    private int treasure;

    public TreasureRoom(int treasure ){
        this.treasure = treasure;
    }



    public int allowToCollectTreasure(){
        return this.treasure;
    }

    public void setTreasure(int number){
        this.treasure = number;
    }

}
