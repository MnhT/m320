package V3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean running = true;

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        int choice;
        while (running) {
            menu.displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    menu.selectCharacter(choice);
                    break;
                case 4:
                    menu.displayCharactersWithAttacks();
                    break;
                case 5:
                    System.out.println("Programm wird beendet.");
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Versuchen Sie es erneut.");
                    break;
            }
        }
    }
}

class Menu {

    private List<Character> characters;

    public Menu() {
        characters = new ArrayList<>();
        characters.add(new King());
        characters.add(new Queen());
        characters.add(new Knight());
    }

    public void displayMenu() {
        System.out.println("\nWähle eine Option:");
        System.out.println("1. König");
        System.out.println("2. Königin");
        System.out.println("3. Ritter");
        System.out.println("4. Liste der Charaktere und ihrer Angriffe anzeigen");
        System.out.println("5. Beenden");
    }

    public void selectCharacter(int choice) {
        Character selectedCharacter = characters.get(choice - 1);
        selectedCharacter.display();
        selectedCharacter.weapon.useWeapon();
    }

    public void displayCharactersWithAttacks() {
        System.out.println("\nListe der Figuren mit deren Angriffe:");
        for (Character character : characters) {
            System.out.print(character.getClass().getSimpleName() + ": ");
            character.weapon.useWeapon();
        }
    }
}