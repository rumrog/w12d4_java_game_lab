package players;

import armory.Armory;
import enemies.Enemy;

import java.util.ArrayList;

public class Barbarian extends MeleeCharacter {

    protected ArrayList<Armory> armory;

    public Barbarian(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        armory = new ArrayList<Armory>();
    }

    public ArrayList<Armory> getArmory(){
        return this.armory;
    }

    public String ripEnemiesHeadOff(Enemy enemy){
        enemy.takeDamage(enemy.checkHealth());
        return "EARUGHHHH!!";
    }
}
