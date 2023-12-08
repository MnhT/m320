package D;

import D.Konto;

// Testklasse
public class BankSimulation {
    public static void main(String[] args) {
        // Drei verschiedene Konten erstellen
        Konto konto1 = new Konto(1, 100, 500);
        Konto konto2 = new Konto(2, 100, 500);
        Konto konto3 = new Konto(3, 100, 500);

        // Einzahlung auf Konto 1
        konto1.einzahlen(0);

        // Überweisung von Konto 2 auf Konto 3
        konto2.ueberweisen(konto3, 500);

        // Abhebung von Konto 3
        konto3.abheben(0);

        // Ausgabe der Kontostände
        System.out.println("Konto " + konto1.getKontoNr() + ": Saldo = " + konto1.getSaldo());
        System.out.println("Konto " + konto2.getKontoNr() + ": Saldo = " + konto2.getSaldo());
        System.out.println("Konto " + konto3.getKontoNr() + ": Saldo = " + konto3.getSaldo());
    }
}