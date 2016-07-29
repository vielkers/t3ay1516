package src.matthew.reyes.Exercise7;
import java.util.ArrayList;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Main {
    public static void main (String[] args) {
        System.out.println("Purchase Order");

        Company refCom = new Company();

        PurchaseOrder refPO = new PurchaseOrder();
        System.out.println("Purchase Order #: " + refPO.getPurchaseOrderNumber());



        System.out.println("Company ID #: " + refCom.getID());
        System.out.println("Company Name: " + refCom.getCompanyName());
        System.out.println("Address: " + refCom.getAddress());
        System.out.println("Telephone Number: " + refCom.getTelephone());



        ArrayList <String> itemID = new ArrayList<String>();
        ArrayList <String> itemDescription = new ArrayList<String>();
        ArrayList <String> itemType = new ArrayList<String>();

        itemID.add("1");
        itemID.add("2");
        itemID.add("3");

        itemDescription.add("Servers");
        itemDescription.add("Database");
        itemDescription.add("Website");

        itemType.add("IT Hardware");
        itemType.add("IT Software");
        itemType.add("General Software");

        System.out.println("Item ID #: " + itemID);
        System.out.println("Item Description: " + itemDescription);
        System.out.println("Item Type: " + itemType);

    }
}
