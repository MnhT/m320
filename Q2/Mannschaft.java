package Q2;

import java.util.ArrayList;

public class Mannschaft {
    // Private Instanzvariablen für den Goalie, Angreifer und Verteidiger
    private Goalie goalie;
    private ArrayList<Angreifer> angreifers;
    private ArrayList<Verteidiger> verteidigers;

    // Konstruktor, initialisiert die Listen für Angreifer und Verteidiger
    public Mannschaft() {
        this.angreifers = new ArrayList<>();
        this.verteidigers = new ArrayList<>();
    }

    // Getter-Methode für den Goalie
    public Goalie getGoalie() {
        return goalie;
    }

    // Setter-Methode für den Goalie
    public void setGoalie(Goalie goalie) {
        this.goalie = goalie;
    }

    // Getter-Methode für die Liste der Angreifer
    public ArrayList<Angreifer> getAngreifers() {
        return angreifers;
    }

    // Setter-Methode für die Liste der Angreifer
    public void setAngreifers(ArrayList<Angreifer> angreifers) {
        this.angreifers = angreifers;
    }

    // Getter-Methode für die Liste der Verteidiger
    public ArrayList<Verteidiger> getVerteidigers() {
        return verteidigers;
    }

    // Setter-Methode für die Liste der Verteidiger
    public void setVerteidigers(ArrayList<Verteidiger> verteidigers) {
        this.verteidigers = verteidigers;
    }
}