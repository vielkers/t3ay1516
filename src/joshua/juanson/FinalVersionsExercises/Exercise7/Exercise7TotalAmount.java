package joshua.juanson.FinalVersionsExercises.Exercise7;
public class Exercise7TotalAmount {
    public static void main(String args[]) {
        int i = 1, purchaseNumber = 1, numberOfUnits = 1;
        String unitOfMeasure  = "pcs", date = "March 5, 2015";
        Exercise7Item item = new Exercise7Item(1, "Item Description", "Item Type", 1f, 1);
        Exercise7Company vendor = new Exercise7Company(1,"JAT Board Enterprises","Marikina City", "682-33-66");
        //System Outputs Purchase Order
        System.out.println("");
        System.out.println("PURCHASE ORDER");
        System.out.println("");
        //System Outputs Company Details and Date
        System.out.println("Company Ref No.: " + vendor.getRefNumber());
        System.out.println("Company Name: " +vendor.getCompanyName());
        System.out.println("Company Address: " + vendor.getCompanyAddress());
        System.out.println("Company Contact: " +vendor.getCompanyContact());
        System.out.println("Date: " + date);
        System.out.println("");
        //System Outputs Purchase Order Number
        System.out.println("Purchase Order Number: " + purchaseNumber);
        System.out.println("Number of Units: " + numberOfUnits);
        System.out.println("Unit of Measure: " + unitOfMeasure);
        System.out.println("");
        //System Outputs Item Description
        System.out.println("ITEM INFORMATION");
        System.out.println("Item ID: " + item.getItemID());
        System.out.println("Item Description: " + item.getItemDesc());
        System.out.println("Item Type: " + item.getItemType());
        System.out.println("Item Price: PHP " + item.getPrice());
        System.out.println("");
        //System Outputs Total Price of PO
        System.out.println("TOTAL AMOUNT IS: PHP " + item.getPrice() * numberOfUnits);
    }
}
