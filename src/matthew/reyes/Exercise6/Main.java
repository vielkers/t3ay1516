package matthew.reyes.Exercise6;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Main {
    public static void main (String[] args){
        System.out.println("Purchase Order");

        Company refCom = new Company();
        Item refItem = new Item();
        PurchaseOrder refPO = new PurchaseOrder();
        System.out.println("Purchase Order #: " + refPO.getPurchaseOrderNumber());



        System.out.println("Company ID #: " + refCom.getID());
        System.out.println("Company Name: " + refCom.getCompanyName());
        System.out.println("Address: " + refCom.getAddress());
        System.out.println("Telephone Number: " + refCom.getTelephone());

        System.out.println("Item ID#: " + refItem.getId());
        System.out.println("Item Description: " + refItem.getItemDescription());
        System.out.println("Item Type: " + refItem.getItemType());
        System.out.println("Item Price: " + refItem.getPrice());
        System.out.println("Is this the Latest Purchase Order #: " +refPO.latestPO());

    }

}

