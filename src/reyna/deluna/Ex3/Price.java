package reyna.deluna.Ex3;

/**
 * Created by IE on 6/17/2016.
 */
public class Price {

    public static void main(String[] args){
        Item lp = new Item(1, "Laptop", 12345.6f, "Electronics", "EA");

        PurchaseOrder lp1 = new PurchaseOrder(12345, 1);

        System.out.println("Item ID: " + lp.getID());
        System.out.println("Item Description: " + lp.getDescr());
        System.out.println("Item Type: " + lp.getType());
        System.out.println("Price: " + lp.getPrice());
        System.out.println("UOM: " + lp.getUOM());

        System.out.println("PO Number: " + lp1.getNum());
        System.out.println("Quantity: " + lp1.getQty());


    }
}
