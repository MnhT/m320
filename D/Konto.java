package D;

public class Konto {
    private int kontoNr;
    private double saldo;

    private double limite;

    // Konstruktor mit Startguthaben von 100
    public Konto(int kontoNr, double Saldo, double Limite) {
        this.kontoNr = kontoNr;
        this.saldo = Saldo;
        this.limite = Limite;

    }

    // Getter für KontoNr
    public int getKontoNr() {
        return kontoNr;
    }

    // Getter für Saldo
    public double getSaldo() {
        return saldo;
    }

    // Einzahlen-Methode
    public void einzahlen(double betrag) {
        saldo += betrag;
        System.out.println("Einzahlung von " + betrag + " auf Konto " + kontoNr + ". Neuer Saldo: " + saldo);
    }

    // Abheben-Methode
    public void abheben(double betrag) {
        if (saldo + limite >= betrag) {
            saldo -= betrag;
            System.out.println("Abhebung von " + betrag + " von Konto " + kontoNr + ". Neuer Saldo: " + saldo);
        } else {
            System.out.println("Nicht genug Guthaben auf Konto " + kontoNr);
        }
    }

    // Überweisen-Methode
    public void ueberweisen(Konto nachKonto, double betrag) {
        if (saldo + limite >= betrag) {
            abheben(betrag);
            nachKonto.einzahlen(betrag);
            System.out.println("Überweisung von Konto " + kontoNr + " nach Konto " + nachKonto.getKontoNr() + " erfolgreich.");
        } else {
            System.out.println("Nicht genug Guthaben auf Konto " + kontoNr + " für die Überweisung.");
        }
    }
}


