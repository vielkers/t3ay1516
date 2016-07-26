package macavinta.gianninah.ex3new;


import instructor.solutions.ex3.Item;
import instructor.solutions.ex3.PurchaseOrder;

public class TotalPrice {

    public static void main(String[] args) {

        Item item = new Item(1, "Item Description", "Item Type", 1);
        PurchaseOrder PO = new PurchaseOrder(1, item, 1, "Unit of Measure");

        System.out.println("");
        System.out.println("Purchase Order");
        System.out.println("PO Number: " + PO.getPONumber());
        System.out.println("Quantity: " + PO.getQuantity());
        System.out.println("Unit of Measure: " + PO.getUnitOfMeasure());

        System.out.println("");
        System.out.println("Item Information");
        System.out.println("Item ID: " + item.getId());
        System.out.println("Description: " + item.getItemDescription());
        System.out.println("Type: " + item.getItemType());
        System.out.println("Price: " + item.getPrice());

        System.out.println("");
        System.out.println("Total Price = " + item.getPrice()*PO.getQuantity());
    }
}