package co.edu.uptc.model;

import java.util.ArrayList;

public class Book {

    private String title;
    private String ISBNCode;
    private int volume;
    private String editorial;
    private Author author;
    private ArrayList<Headquarter> headquarter;

    public Book() {
    }

    public Book(String title, String ISBNCode, int volume, String editorial, Author author, ArrayList<Headquarter> headquarter) {
        this.title = title;
        this.ISBNCode = ISBNCode;
        this.volume = volume;
        this.editorial = editorial;
        this.author = author;
        this.headquarter = headquarter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBNCode() {
        return ISBNCode;
    }

    public void setISBNCode(String ISBNCode) {
        this.ISBNCode = ISBNCode;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public ArrayList<Headquarter> getHeadquarter() {
        return headquarter;
    }

    public void setHeadquarter(ArrayList<Headquarter> headquarter) {
        this.headquarter = headquarter;
    }
}
