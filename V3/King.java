package V3;

public class King extends Character {
    public King() {

        weapon = new AxeBehavior();
    }

    @Override
    public void display() {

        System.out.println("König");
    }
}