package V;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class medien {
    private String title;
    private int year;
    private double price;

    public medien(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayAdditionalInfo();
}

class DVD extends medien {
    private int filmLength;

    public DVD(String title, int year, double price, int filmLength) {
        super(title, year, price);
        this.filmLength = filmLength;
    }

    public int getFilmLength() {
        return filmLength;
    }

    @Override
    public void displayAdditionalInfo() {
        System.out.println("Film Length: " + getFilmLength() + " minutes");
    }
}

class CD extends medien {
    private String bandName;

    public CD(String title, int year, double price, String bandName) {
        super(title, year, price);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public void displayAdditionalInfo() {
        System.out.println("Band Name: " + getBandName());
    }
}

class Book extends medien {
    private String isbn;

    public Book(String title, int year, double price, String isbn) {
        super(title, year, price);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void displayAdditionalInfo() {
        System.out.println("ISBN: " + getIsbn());
    }
}
