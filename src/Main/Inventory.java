package Main;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private Map<String, Book> books = new HashMap<>();
    private Map<String, Book> oldBooks = new HashMap<>();

    public void addBook(Book book){
        Year currentYear = Year.now();

        if (books.containsKey(book.getISBN()) || (oldBooks.containsKey(book.getISBN()))){
            Logging.log("there is already a book with the same ISBN");
            return;
        }

        if ((currentYear.getValue() -   book.getYearPublished().getValue()) < 10){
            books.put(book.getISBN(),book);
            Logging.log("Book has been added to inventory");
        }else {
            oldBooks.put(book.getISBN(),book);
            Logging.log("10 years or more have passed since publish year , Book has been added to Old Books inventory");

        }
    }


    public void buyBook(DeliverData deliverData,String ISBN){
        if (!books.containsKey(ISBN)){
            Logging.log("this book dose not exist");
            return;
        }

        Book book = books.get(ISBN);
        book.deliver(deliverData);
    }
}
