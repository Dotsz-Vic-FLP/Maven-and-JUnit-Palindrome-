package Characters;

public class NPC extends Character{
    public NPC(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("NPC with name " + this.name);
    }
}
