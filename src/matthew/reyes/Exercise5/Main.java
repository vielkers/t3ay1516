package src.matthew.reyes.Exercise5;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Purchase Order: ");

        Company refCom = new Company();
        Item refItem = new Item();
        PurchaseOrder refPOrder = new PurchaseOrder();

        System.out.println("Purchase Order Number: " + refPOrder.getPONumber());
        System.out.println("Date Issued: " + refPOrder.getDate());

        System.out.println("Company ID Number: " + refCom.getiD());
        System.out.println("Company Name: " + refCom.getName());
        System.out.println("Address: " + refCom.getAddress());
        System.out.println("Telephone Number: " + refCom.getTelephone());

        System.out.println("Item ID Number: " + refItem.getId());
        System.out.println("Item Description: " + refItem.getItemDescription());
        System.out.println("Item Type: " + refItem.getItemType());
        System.out.println("Item Price: " + refItem.getPrice());

    }
}
