package aranguren.bernadette;

public class Item {
    public static void main (String[] args){

        int poNumber = 923;
        String[] item = new String[]{"Cream Bowl","Hand Towel","Overnight Kit","1/1 Traymat","White Seal"};
        int[] quantity = new int[]{24, 50, 100, 2, 3};
        String[] uom = new String[]{"EA", "BX", "ST", "CS", "TH"};

        PurchaseOrder PO = new PurchaseOrder(poNumber, item, quantity, uom);

        int[] CoId = new int[]{112, 113, 114, 115, 116};
        String[] CoName = new String[]{"Sky Kitchen", "Gate Gourmet", "HACOR Inc.", "TFK Corporation", "LSG Sky Chefs"};
        String[] address = new String[]{"MNL", "LHR", "LAX", "HND", "BKK"};
        String[] phone = new String[]{"121212", "343434", "565656", "787878", "909090"};

        Company CO = new Company(CoId, CoName, address, phone);

        int[] itemID = new int[] {82964, 91464, 82792, 92395, 83100};
        String[] itemDesc = new String[] {"Porcelain Cream Bowl (Tall)", "Disposable Towels in Box", "Business Class Overnight Kit", "Atlas Paper Traymat 1/1","Seal, Plastic 'White' without Barcode"};
        String[] itemType = new String[] {"Equipment", "Linen", "Bonded", "Equipment Supplies", "Dry Goods"};
        float[] price = new float[] {1.4f, 1.62f, 5.5f, 54.29f, 22.25f};


        System.out.println("PO NUMBER: " + PO.poNumber);
        System.out.printf("%-9s %-12s %-8s %-8s %-11s %-18s %-40s %-16s %-6s %-14s %-12s %-8s \n", "Co.ID", "COMPANY", "ADDRESS", "TEL NO", "ITEM ID", "ITEM", "ITEM DESC", "TYPE", "UOM", "UNIT PRICE", "QUANTITY", "AMOUNT");
        int i;
        for(i = 0; i < 5; i++){

            System.out.printf("%-6d %-17s %-6s %-9s %-8d %-16s %-40s %-20s %-6s $%-14f %-10d %-8f \n", CoId[i], CoName[i], address[i], phone[i], itemID[i], PO.item[i], itemDesc[i], itemType[i], PO.uom[i], price[i], PO.quantity[i], price[i]*PO.quantity[i]);
        }
        float j = 0;
        float num = 0;
        for(i = 0; i < 5; i++) {
            num = price[i]*PO.quantity[i];
            j = j+num;
        }
        System.out.println("\n\n TOTAL PRICE: " + "$" + j);
    }
}


