package V2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // Private Instanzvariable für die Mannschaft
    private Mannschaft mannschaft;

    // Konstruktor, initialisiert eine neue Mannschaft
    public Menu() {
        this.mannschaft = new Mannschaft();
    }

    // Getter-Methode für die Mannschaft
    public Mannschaft getMannschaft() {
        return mannschaft;
    }

    // Setter-Methode für die Mannschaft
    public void setMannschaft(Mannschaft mannschaft) {
        this.mannschaft = mannschaft;
    }

    // Methode zum Hinzufügen eines Goalies zur Mannschaft
    public void addGoalie(Goalie newGoalie) {
        mannschaft.setGoalie(newGoalie);
    }

    // Methode zum Hinzufügen eines Angreifers zur Mannschaft
    public void addAngreifer(Angreifer newAngreifer) {
        ArrayList<Angreifer> newAngreifers = mannschaft.getAngreifers();
        if (newAngreifers.size() < 16) {
            newAngreifers.add(newAngreifer);
            mannschaft.setAngreifers(newAngreifers);
        } else {
            System.out.println("Ihre Mannschaft besitzt bereits die maximale Anzahl Angreifer.");
        }
    }

    // Methode zum Hinzufügen eines Verteidigers zur Mannschaft
    public void addVerteidiger(Verteidiger newVerteidiger) {
        ArrayList<Verteidiger> newVerteidigers = mannschaft.getVerteidigers();
        if (newVerteidigers.size() < 4) {
            newVerteidigers.add(newVerteidiger);
            mannschaft.setVerteidigers(newVerteidigers);
        } else {
            System.out.println("Ihre Mannschaft besitzt bereits die maximale Anzahl Verteidiger.");
        }
    }

    // Methode zum Erstellen und Hinzufügen eines neuen Spielers zur Mannschaft
    public void createAndAddSpieler() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den Namen des Spielers ein: ");
        String name = scanner.nextLine();

        System.out.print("Bitte geben Sie die Rolle des Spielers ein (Angreifer(1)/Verteidiger(2)/Goalie(3)): ");
        String rolle = scanner.nextLine();

        Spieler newSpieler;

        switch (rolle.toLowerCase()) {
            case "1":
                newSpieler = new Angreifer();
                break;
            case "2":
                newSpieler = new Verteidiger();
                break;
            case "3":
                newSpieler = new Goalie();
                break;
            default:
                System.out.println("Ungültige Rolle. Spieler wurde nicht erstellt.");
                return;
        }

        newSpieler.setName(name);

        if (newSpieler instanceof Angreifer) {
            addAngreifer((Angreifer) newSpieler);
        } else if (newSpieler instanceof Verteidiger) {
            addVerteidiger((Verteidiger) newSpieler);
        } else if (newSpieler instanceof Goalie) {
            addGoalie((Goalie) newSpieler);
        }

        System.out.println("Spieler wurde erstellt und der Mannschaft hinzugefügt.");
    }
}