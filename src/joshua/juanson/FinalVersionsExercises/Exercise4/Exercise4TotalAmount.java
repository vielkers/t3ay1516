package joshua.juanson.FinalVersionsExercises.Exercise4;
public class Exercise4TotalAmount {
    public static void main(String args[]) {
        int i = 1;
        int purchaseNumber = 1, numberOfUnits = 1;
        String unitOfMeasure  = "pcs";
        Exercise4Item item = new Exercise4Item(1, "Item Description", "Item Type", 1f, 1);
        System.out.println("");
        System.out.println("PURCHASE NUMBER");
        for (i = 1; i <= 1; i++) {
            purchaseNumber = 1;
            numberOfUnits = 1;
            System.out.println("Purchase Order Number: " + purchaseNumber);
            System.out.println("Number of Units: " + numberOfUnits);
            System.out.println("Unit of Measure: " + unitOfMeasure);
            System.out.println("");
            System.out.println("ITEM INFORMATION");
            System.out.println("Item ID: " + item.getItemID());
            System.out.println("Item Description: " + item.getItemDesc());
            System.out.println("Item Type: " + item.getItemType());
            System.out.println("Item Price: PHP " + item.getPrice());
            System.out.println("");
            System.out.println("TOTAL AMOUNT IS: PHP " + item.getPrice() * numberOfUnits);
        }
    }
}