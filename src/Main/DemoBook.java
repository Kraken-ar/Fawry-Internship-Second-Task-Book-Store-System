package Main;

import java.time.Year;

public class DemoBook extends Book{

    public DemoBook(String ISBN, String title, Year yearPublished, double price, String authorName) {
        super(ISBN, title, yearPublished, price, authorName);
    }

    @Override
    void deliver(DeliverData deliverData) {
        String msg = "this book is Just for Preview , it cannot be shipped or sent through mail";
        Logging.log(msg);
    }
}
