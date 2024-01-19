package Q2;

public class Spieler {
    // Private Instanzvariable für den Namen des Spielers
    private String name;

    // Getter-Methode für den Namen
    public String getName() {
        return name;
    }

    // Setter-Methode für den Namen
    public void setName(String name) {
        this.name = name;
    }

    // Methode zum Anzeigen des Namens des Spielers
    public void zeigeName() {
        System.out.println("Name: " + name);
    }

    // Standardmethode zum Anzeigen der Rolle des Spielers
    public void spielen() {
        System.out.println("Rolle: Spieler");
    }
}