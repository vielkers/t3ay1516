package src.matthew.reyes.Exercise3;

/**
 * Created by victorreyes on 28/06/2016.
 */
public class TotalAmount {
    public static void main(String[] args) {
        Item sh = new Item(1001, "Palmolive" , "Shampoo" , 75.70f);
        PurchaseOrder sh1 = new PurchaseOrder(1, "Pieces" , 1 , sh);

        System.out.println("Item ID: " + sh.getItemId());
        System.out.println("Item Description: " + sh.getItemDescription());
        System.out.println("Item Type: " + sh.getItemType());
        System.out.println("Item Price: " + sh.getPrice());
        System.out.println("Unit of Measurement: " + sh1.getUOM());
        System.out.println("Purchase Order Number: " + sh1.getPONumber());
        System.out.println("Quantity: " + sh1.getQuantity());
    }
}
