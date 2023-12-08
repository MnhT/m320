/* package V;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Medial {
    public static void main(String[] args) {
        List<medien> medienList = new ArrayList<>();

        DVD dvd = new DVD("Inception", 2010, 19.99, 148);
        CD cd = new CD("Thriller", 1982, 14.99, "Michael Jackson");
        Book book = new Book("To Kill a Mockingbird", 1960, 9.99, "9780061120084");

        medienList.add(dvd);
        medienList.add(cd);
        medienList.add(book);

        // Ausgabe der Elemente in der Konsole
        for (medien medien : medienList) {44444
            System.out.println("Title: " + medien.getTitle());
            System.out.println("Year: " + medien.getYear());
            System.out.println("Price: $" + medien.getPrice());

            if (medien instanceof DVD) {
                System.out.println("Film Length: " + ((DVD) medien).getFilmLength() + " minutes");
            } else if (medien instanceof CD) {
                System.out.println("Band Name: " + ((CD) medien).getBandName());
            } else if (medien instanceof Book) {
                System.out.println("ISBN: " + ((Book) medien).getIsbn());
            }

            System.out.println("---------------");
        }

        // Entfernen eines Elements aus der Liste
        removeMedia(medienList, dvd);

        // Überprüfen, ob das Element entfernt wurde
        System.out.println("After removal:");
        for (medien medien : medienList) {
            System.out.println("Title: " + medien.getTitle());
        }
    }

    // Methode zum Entfernen eines Elements aus der Liste
    private static void removeMedia(List<medien> medienList, medien medien) {
        Iterator<medien> iterator = medienList.iterator();
        while (iterator.hasNext()) {
            medien currentMedien = iterator.next();
            if (currentMedien.equals(medien)) {
                iterator.remove();
                break;
            }
        }
    }
} */