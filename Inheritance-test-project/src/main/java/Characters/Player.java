package Characters;

public class Player extends Character{
    public Player(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Player with name " + this.name);
    }
}
