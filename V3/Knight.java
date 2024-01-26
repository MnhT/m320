package V3;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("Ritter");
    }
}