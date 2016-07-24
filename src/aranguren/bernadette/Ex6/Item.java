package aranguren.bernadette.Ex6;

public class Item {
    public static void main (String[] args){


        PurchaseOrder PO = new PurchaseOrder();
        Company CO = new Company();

        int[] itemID = new int[] {82964, 91464, 82792, 92395, 83100};
        String[] itemDesc = new String[] {"Porcelain Cream Bowl (Tall)", "Disposable Towels in Box", "Business Class Overnight Kit", "Atlas Paper Traymat 1/1","Seal, Plastic 'White' without Barcode"};
        String[] itemType = new String[] {"Equipment", "Linen", "Bonded", "Equipment Supplies", "Dry Goods"};
        float[] price = new float[] {1.4f, 1.62f, 5.5f, 54.29f, 22.25f};


        System.out.println("PO NUMBER: " + PO.poNumber);
        System.out.printf("%-9s %-12s %-8s %-8s %-11s %-18s %-40s %-16s %-6s %-14s %-12s %-8s \n", "Co.ID", "COMPANY", "ADDRESS", "TEL NO", "ITEM ID", "ITEM", "ITEM DESC", "TYPE", "UOM", "UNIT PRICE", "QUANTITY", "AMOUNT");
        int i;
        for(i = 0; i < 5; i++){

            System.out.printf("%-6d %-17s %-6s %-9s %-8d %-16s %-40s %-20s %-6s $%-14f %-10d %-8f \n", CO.CoId[i], CO.CoName[i], CO.address[i], CO.phone[i], itemID[i], PO.item[i], itemDesc[i], itemType[i], PO.uom[i], price[i], PO.quantity[i], price[i]*PO.quantity[i]);
        }
        float j = 0;
        float num;
        for(i = 0; i < 5; i++) {
            num = price[i]*PO.quantity[i];
            j = j+num;
        }
        System.out.println("\n\n TOTAL PRICE: " + "$" + j);
    }
}
