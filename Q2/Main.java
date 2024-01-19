package Q2;

public class Main {
    public static void main(String[] args) {
        // Erzeugt ein Menü-Objekt
        Menu menu = new Menu();

        // Fügt Spieler dem Menü hinzu
        menu.createAndAddSpieler();
        menu.createAndAddSpieler();
        menu.createAndAddSpieler();

        // Fügt einen Verteidiger dem Menü hinzu
        menu.addVerteidiger(new Verteidiger());

        // Zeigt Informationen über den Goalie an
        System.out.println("Goalie:");
        menu.getMannschaft().getGoalie().zeigeName();
        menu.getMannschaft().getGoalie().spielen();

        // Zeigt erneut Informationen über den Goalie an
        System.out.println("Goalie:");
        menu.getMannschaft().getGoalie().zeigeName();
        menu.getMannschaft().getGoalie().spielen();

        // Zeigt Informationen über die Angreifer an
        System.out.println("\nAngreifer:");
        for (Angreifer angreifer : menu.getMannschaft().getAngreifers()) {
            angreifer.zeigeName();
            angreifer.spielen();
        }

        // Zeigt Informationen über den Verteidiger an, falls vorhanden
        System.out.println("\nVerteidiger:");
        if (!menu.getMannschaft().getVerteidigers().isEmpty()) {
            Verteidiger verteidiger = menu.getMannschaft().getVerteidigers().get(0);
            verteidiger.zeigeName();
            verteidiger.spielen();
        }
    }
}