package Characters;

public class Character {
    protected String name;

    public Character(String name) {
        name = name;
    }

    public void display() {
        System.out.println("Hello, my name is" + name + ".");
    }
}
