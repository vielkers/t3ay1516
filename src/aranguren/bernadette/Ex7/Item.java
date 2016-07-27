package aranguren.bernadette.Ex7;

import java.util.ArrayList;

public class Item {
    public static void main (String[] args){

        int poNumber = 923;

        ArrayList<String> item = new ArrayList<String>();
        item.add("Cream Bowl");
        item.add("Hand Towel");
        item.add("Overnight Kit");
        item.add("1/1 Traymat");
        item.add("White Seal");

        ArrayList<Integer> quantity = new ArrayList<Integer>();
        quantity.add(24);
        quantity.add(50);
        quantity.add(100);
        quantity.add(2);
        quantity.add(3);

        ArrayList<String> uom = new ArrayList<String>();
        uom.add("EA");
        uom.add("BX");
        uom.add("ST");
        uom.add("CS");
        uom.add("TH");

        int[] CoId = new int[]{112, 113, 114, 115, 116};
        String[] CoName = new String[]{"Sky Kitchen", "Gate Gourmet", "HACOR Inc.", "TFK Corporation", "LSG Sky Chefs"};
        String[] address = new String[]{"MNL", "LHR", "LAX", "HND", "BKK"};
        String[] phone = new String[]{"121212", "343434", "565656", "787878", "909090"};

        Company CO = new Company(CoId, CoName, address, phone);

        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(82964);
        itemID.add(91464);
        itemID.add(82792);
        itemID.add(92395);
        itemID.add(83100);

        ArrayList<String> itemDesc = new ArrayList<String>();
        itemDesc.add("Porcelain Cream Bowl (Tall)");
        itemDesc.add("Disposable Towels in Box");
        itemDesc.add("Business Class Overnight Kit");
        itemDesc.add("Atlas Paper Traymat 1/1");
        itemDesc.add("Seal, Plastic 'White' without Barcode");

        ArrayList<String> itemType = new ArrayList<String>();
        itemType.add("Equipment");
        itemType.add("Linen");
        itemType.add("Bonded");
        itemType.add("Equipment Supplies");
        itemType.add("Dry Goods");

        ArrayList<Float> price = new ArrayList<Float>();
        price.add(1.4f);
        price.add(1.62f);
        price.add(5.5f);
        price.add(54.29f);
        price.add(22.25f);


        System.out.println("PO NUMBER: " + poNumber);
        System.out.printf("%-9s %-12s %-8s %-8s %-11s %-18s %-40s %-16s %-6s %-14s %-12s %-8s \n", "Co.ID", "COMPANY", "ADDRESS", "TEL NO", "ITEM ID", "ITEM", "ITEM DESC", "TYPE", "UOM", "UNIT PRICE", "QUANTITY", "AMOUNT");
        int i;
        for(i = 0; i < 5; i++){

            System.out.printf("%-6d %-17s %-6s %-9s %-8d %-16s %-40s %-20s %-6s $%-14f %-10d %-8f \n", CoId[i], CoName[i], address[i], phone[i], itemID.get(i), item.get(i), itemDesc.get(i), itemType.get(i), uom.get(i), price.get(i), quantity.get(i), price.get(i)*quantity.get(i));
        }
        float j = 0;
        float num = 0;
        for(i = 0; i < 5; i++) {
            num = price.get(i)*quantity.get(i);
            j = j+num;
        }
        System.out.println("\n\n TOTAL PRICE: " + "$" + j);
    }
}


