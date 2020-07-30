package armory;

public class Pickaxe extends Armory{
    public Pickaxe(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(String data) {
        return "The pickaxe has dealt " + data + " damage!";
    }

}
