package ryna.bato;

public class Item2 {
    public static void main(String[] args) {
        //assign "public static void main" to class where you want to place called values
        //to get called values, ensure that:
        //(1) constructor is made in other class with desired values of variables
        //(2) get and set are placed in other class
        PurchaseOrder2 myPO = new PurchaseOrder2();

        int itemID = 11209151;
        String itemDesc = "Tupperware Brands Scent endorsed by Maja Salvador";
        String itemType = "Celebrity Fragrance";
        float price = 139f;

        //calling values from other class
        System.out.println("PO NUMBER        : " + myPO.poNumber);
        System.out.println("ITEM             : " + myPO.item);
        System.out.println("QUANTITY         : " + myPO.quantity);
        System.out.println("UNIT OF MEASURE  : " + myPO.uom + "\n");

        //calling values within same class
        System.out.println("YOUR ORDER IS:");
        System.out.println("ITEM ID          : " + itemID);
        System.out.println("ITEM DESCRIPTION : " + itemDesc);
        System.out.println("ITEM TYPE        : " + itemType);
        System.out.println("PRICE PER UNIT   : " + "PHP " + price + "\n");

        //combining value from both classes
        System.out.println("TOTAL PRICE      : " + "PHP " + price*myPO.quantity);


    }
}
