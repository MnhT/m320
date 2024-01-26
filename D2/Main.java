package D2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Schulklasse schulklasse = new Schulklasse();

        System.out.print("Anzahl der Schüler: ");
        int anzahlSchueler = scanner.nextInt();

        for (int i = 1; i <= anzahlSchueler; i++) {
            System.out.print("Name des Schülers " + i + ": ");
            String schuelerName = scanner.next();

            Schueler schueler = new Schueler(schuelerName);

            for (int j = 1; j <= 3; j++) { // Annahme: Es gibt 3 Tests pro Schüler
                System.out.print("Note für Test " + j + ": ");
                float testNote = scanner.nextFloat();
                schueler.addTest(new Test(testNote));
            }

            schulklasse.addSchueler(schueler);
        }

        System.out.println("Durchschnittsnote für die Klasse: " + schulklasse.getNotenschnitt());

        for (Schueler schueler : schulklasse.getSchuelerListe()) {
            System.out.println("Durchschnittsnote für " + schueler.getName() + ": " +
                    schueler.getNotenschnitt());
            for (Test test : schueler.getTestListe()) {
                System.out.println("Testnote: " + test.getFormatedNote());
            }
        }

        // Schließe den Scanner
        scanner.close();
    }
}