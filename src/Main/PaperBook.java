package Main;

import java.time.Year;

public class PaperBook extends Book{

    private int quantity ;
    public PaperBook(String ISBN, String title, Year yearPublished, double price, String authorName,int quantity ) {
        super(ISBN, title, yearPublished, price, authorName);
        this.quantity = quantity;
    }

    @Override
    void deliver(DeliverData deliverData) {
        String msg;
        if (deliverData.address == null || deliverData.address.isEmpty()){
            Logging.log("the Address is Missing");
            return;
        }
        if (quantity > 0){
            quantity -= 1;
             msg = "Book has been shipped to address :"+deliverData.address;
        }else {
             msg = "Book is out of stock";
        }

        Logging.log(msg);

    }


}
