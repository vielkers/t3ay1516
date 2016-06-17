package aranguren.bernadette;

public class Item {
    public static void main (String[] args){

        PurchaseOrder PO = new PurchaseOrder();

        int itemID = 11217014;
        String itemDesc = "C2 green tea";
        String itemType = "Beverage";
        float price = 30f;

        System.out.println("PO NUMBER       : " + PO.poNumber);
        System.out.println("ITEM            : " + PO.item);
        System.out.println("QUANTITY        : " + PO.quantity);
        System.out.println("UNIT OF MEASURE : " + PO.uom + "\n");

        System.out.println("YOUR ORDER IS:");
        System.out.println("ITEM ID          : " + itemID);
        System.out.println("ITEM DESCRIPTION : " + itemDesc);
        System.out.println("ITEM TYPE        : " + itemType);
        System.out.println("PRICE PER UNIT   : " + "PHP " + price + "\n");

        System.out.println("TOTAL PRICE      : " + "PHP " + price*PO.quantity);

    }
}
