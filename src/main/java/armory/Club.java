package armory;

public class Club extends Armory{

    public Club(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(String data) {
        return "The club has dealt " + data + " damage!";
    }
}
