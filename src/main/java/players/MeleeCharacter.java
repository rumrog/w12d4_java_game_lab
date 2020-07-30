package players;

import actions.IAttack;
import armory.Armory;
import enemies.Enemy;

import java.util.ArrayList;

public abstract class MeleeCharacter extends Player implements IAttack {

    protected ArrayList<Armory> armory;

    public MeleeCharacter(String name, int healthPoints, int treasureChest){
       super(name, healthPoints, treasureChest);
       this.armory = new ArrayList<Armory>();
    }

    public void addItemToArmory(Armory item){
        this.armory.add(item);
    }

    public void attack(Armory item, Enemy enemy){
        enemy.takeDamage(item.getDamageToDeal());
    }

    public int countArmory(){
        return this.armory.size();
    }

}
