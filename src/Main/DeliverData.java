package Main;

public class DeliverData {
    public String email;
    public String address;

    public static DeliverData withAddress(String address){
        DeliverData deliverData = new DeliverData();
        deliverData.address = address;
        return deliverData;
    }
    public static DeliverData withEmail(String email){
        DeliverData deliverData = new DeliverData();
        deliverData.email = email;
        return deliverData;
    }
}
