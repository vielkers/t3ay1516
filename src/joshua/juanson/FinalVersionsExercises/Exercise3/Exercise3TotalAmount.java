package joshua.juanson.FinalVersionsExercises.Exercise3;

public class Exercise3TotalAmount {
    public static void main(String args[]) {
        Exercise3Item item = new Exercise3Item(1, "Item Description", "Item Type", 1f, 1);
        Exercise3PurchaseOrder PO = new Exercise3PurchaseOrder(1, item, 1, "Unit of Measure");

        System.out.println("");
        System.out.println("PURCHASE NUMBER");
        System.out.println("Purchase Order Number: " + PO.getPurchaseNumber());
        System.out.println("Number of Units: " + PO.getNumberOfUnits());
        System.out.println("Unit of Measure: " + PO.getUnitOfMeasure());
        System.out.println("");
        System.out.println("ITEM INFORMATION");
        System.out.println("Item ID: " + item.getItemID());
        System.out.println("Item Description: " + item.getItemDesc());
        System.out.println("Item Type: " + item.getItemType());
        System.out.println("Item Price: PHP " + item.getPrice());
        System.out.println("");
        System.out.println("TOTAL AMOUNT IS: PHP " + item.getPrice() * PO.getNumberOfUnits());
    }
}