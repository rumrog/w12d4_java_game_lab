package rooms;

import java.util.ArrayList;

public abstract class Room {

    protected Boolean exitIsLocked;

    public Room(){
        this.exitIsLocked = true;
    }

    public Boolean checkExit(){
        return this.exitIsLocked;
    }

    public void openExit(){
        this.exitIsLocked = true;
    }
}
