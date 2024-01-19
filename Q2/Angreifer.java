package Q2;

public class Angreifer extends Spieler {

    // Methode für das Jogging-Training
    public void jogTraining() {
        System.out.println("Training: Joggen");
    }

    // Überschriebene Methode für das Spielen, gibt die Rolle des Angreifers aus
    @Override
    public void spielen() {
        System.out.println("Rolle: Angreifer");
    }
}