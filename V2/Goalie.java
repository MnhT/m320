package V2;

public class Goalie extends Spieler {

    // Private Variable für die Körpergröße des Goalies
    private double koerperGroesse;

    // Getter-Methode für die Körpergröße
    public double getKoerperGroesse() {
        return koerperGroesse;
    }

    // Setter-Methode für die Körpergröße
    public void setKoerperGroesse(double koerperGroesse) {
        this.koerperGroesse = koerperGroesse;
    }

    // Überschriebene Methode für das Spielen, gibt die Rolle des Goalies aus
    @Override
    public void spielen() {
        System.out.println("Rolle: Goalie");
    }
}