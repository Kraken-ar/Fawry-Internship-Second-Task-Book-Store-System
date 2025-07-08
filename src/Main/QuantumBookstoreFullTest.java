package Main;

import java.time.Year;

public class QuantumBookstoreFullTest {

    public static void main(String[] args) {
        //Inventory
        Inventory inventory = new Inventory();

        //Books
        Book book1 = new PaperBook("1210","World War One Documentary", Year.of(2019),12.5,"John Marten",1);
        Book book2 = new Ebook("1211","Simba:the Lion King", Year.of(2000),1.5,"Mark Henry");
        Book book3 = new DemoBook("1212","The Secret Of the Pyramids",Year.of(2020),16.3,"Zahi Hawas");

        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);
        inventory.addBook(book3);

        inventory.buyBook(DeliverData.withAddress("Cairo"),"1210");
        inventory.buyBook(DeliverData.withAddress("Cairo"),"1210");
        inventory.buyBook(DeliverData.withEmail("mdahb2004@gmail.com"),"1211");
        inventory.buyBook(DeliverData.withAddress("Cairo"),"1212");


    }
}
