package Main;

import java.time.LocalDate;
import java.time.Year;

abstract public class Book {

    private String ISBN;
    private String title;
    private Year yearPublished;
    private double price;
    private String authorName;

    public Book(String ISBN, String title, Year yearPublished, double price, String authorName) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.authorName = authorName;
    }

    abstract void deliver(DeliverData deliverData);
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Year yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
