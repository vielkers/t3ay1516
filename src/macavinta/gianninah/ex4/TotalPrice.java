package macavinta.gianninah.ex4;

/**
 * Created by IE on 7/15/2016.
 */
public class TotalPrice {public static void main(String[] args) {

    float totalPrice = 0;

    item[] item = new item[] {
            new item(1, "Item Description 1", "Item Type 1", 1),
            new item(2, "Item Description 2", "Item Type 2", 2)
    };

    float[] quantity = {1,2};
    String[] UnitOfMeasure = {"Unit 1", "Unit 2"};

    PurchaseOrder PO = new PurchaseOrder(1, item, quantity, UnitOfMeasure);

    System.out.println("");
    System.out.println("Purchase Order");
    System.out.println("PO Number: " + PO.getPONumber());

    for(int i = 0; i < item.length ; i++){
        System.out.println("");
        System.out.println("Item Information");
        System.out.println("Item ID: " + item[i].getId());
        System.out.println("Description: " + item[i].getItemDescription());
        System.out.println("Quantity: " + PO.getQuantity()[i]);
        System.out.println("Type: " + item[i].getItemType());
        System.out.println("Price: " + item[i].getPrice());
        System.out.println("Unit of Measure: " + PO.getUnitOfMeasure()[i]);
    }

    for(int i = 0; i < item.length ; i++){
        totalPrice += item[i].getPrice() * PO.getQuantity()[i];
    }

    System.out.println("");
    System.out.println("Total Price = " + totalPrice);
}

}
