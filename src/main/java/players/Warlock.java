package players;

import spells.Spells;

import players.MagicCharacter;
import spells.Spells;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Warlock extends MagicCharacter {

    protected ArrayList<Spells> spells;

    public Warlock(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.spells = new ArrayList<Spells>();
    }

    public ArrayList<Spells> getSpells(){
        return this.spells;
    }

}
