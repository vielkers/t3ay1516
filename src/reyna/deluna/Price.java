package reyna.deluna;

/**
 * Created by IE on 6/17/2016.
 */
public class Price {
}
    public static void main(String[] args){
        Item lp = new Item(1, "laptop", 12345.6f, "gadget", "ea");

        PurchaseOrder lp1 = new PurchaseOrder(32131241, 412f);

        System.out.println("Item ID: " + lp.getID());
        System.out.println("Item Desccription: " + lp.getDescr());
        System.out.println("Item Type: " + lp.getType());
        System.out.println("Price: " + lp.getPrice());
        System.out.println("UOM: " + lp.getUOM());

        System.out.println("PO Number: " + lp1.getNum());
        System.out.println("Quantity: " + lp1.getQty());


    }
}
