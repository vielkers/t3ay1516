package joshua.juanson.FinalVersionsExercises.Exercise6;

import java.util.ArrayList;

public class Exercise6TotalAmount {
    public static void main(String args[]) {
        int i = 1, purchaseNumber = 1, numberOfUnits = 1;
        String unitOfMeasure = "pcs", date = "March 5, 2015";
        Exercise6Item item = new Exercise6Item(1, "Item Description", "Item Type", 1f, 1);
        Exercise6Company vendor = new Exercise6Company(1, "JAT Board Enterprises", "Marikina City", "682-33-66");
        Exercise6PurchaseOrder PO = new Exercise6PurchaseOrder(1, "March 5, 2015", 1f, "Units");
        //System Outputs Purchase Order
        System.out.println("");
        System.out.println("PURCHASE ORDER");
        System.out.println("");
        //System Outputs Company Details and Date
        System.out.println("Company Ref No.: " + vendor.getRefNumber());
        System.out.println("Company Name: " + vendor.getCompanyName());
        System.out.println("Company Address: " + vendor.getCompanyAddress());
        System.out.println("Company Contact: " + vendor.getCompanyContact());
        System.out.println("Date: " + date);
        System.out.println("");
        //System Outputs Purchase Order Number
        System.out.println("Purchase Order Number: " + PO.getPurchaseNumber());
        System.out.println("Number of Units: " + PO.getNumberOfUnits());
        System.out.println("Unit of Measure: " + PO.getUnitOfMeasure());
        System.out.println("");
        //System Outputs Item Description
        System.out.println("ITEM INFORMATION");
        System.out.println("Item ID: " + item.getItemID());
        System.out.println("Item Description: " + item.getItemDesc());
        System.out.println("Item Type: " + item.getItemType());
        System.out.println("Item Price: PHP " + item.getPrice());
        System.out.println("Item Quantity: " + item.getQuantity());
        System.out.println("");
        //System Outputs Total Price of PO
        System.out.println("TOTAL AMOUNT IS: PHP " + item.getPrice() * PO.getNumberOfUnits());
    }
}
