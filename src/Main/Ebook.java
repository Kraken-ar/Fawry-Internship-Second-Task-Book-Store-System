package Main;

import java.time.Year;

public class Ebook extends Book  {



    public Ebook(String ISBN, String title, Year yearPublished, double price, String authorName) {
        super(ISBN, title, yearPublished, price, authorName);

    }


    @Override
    public void deliver(DeliverData deliverData) {
        String msg = "book has been sent to email address :"+ deliverData.email;
        Logging.log(msg);

    }
}
