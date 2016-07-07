package aranguren.bernadette;


public class ItemEx3 {
    public static void main (String[] args){

        PurchaseOrderEx3 PO = new PurchaseOrderEx3();

        int itemID = 11217014;
        String itemDesc = "Porcelain Cream Bowl (Tall)";
        String itemType = "Equipment";
        float price = 1.4f;
        int i = 1;

        System.out.println("PO NUMBER: " + PO.poNumber);
        System.out.printf("%-5s %-10s %-18s %-40s %-25s %-10s %-15s %-14s %-10s \n", "NO", "ITEM ID", "ITEM", "ITEM DESC", "TYPE", "UOM", "UNIT PRICE", "QUANTITY", "AMOUNT");
        System.out.printf("%-5d %-10d %-18s %-40s %-25s %-10s $%-16f %-12d %-10f \n", i+1, itemID, PO.item, itemDesc, itemType, PO.uom, price, PO.quantity, price*PO.quantity);
        System.out.println("\n\nTOTAL PRICE : " + "$" + price*PO.quantity);

    }
}
