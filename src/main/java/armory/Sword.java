package armory;

import actions.IAttack;

public class Sword extends Armory {

    public Sword(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(String data) {
        return "The sword has dealt " + data + " damage!";
    }
}
