package D2;

public class Test {
    private float note;

    public Test(float note) {
        this.note = note;
    }

    public float getNote() {
        return note;
    }

    public String getFormatedNote() {
        return String.format("%.2f", note);
    }
}
