package joshua.juanson.FinalVersionsExercises.Exercise7;
import java.util.ArrayList;

public class Exercise7Item {
    public static void main (String[] args){

        int poNumber = 111;

        ArrayList<String> item = new ArrayList<String>();
        item.add("Pencil");
        item.add("Ballpen");
        item.add("Notebook");
        item.add("Book");
        item.add("Eraser");

        ArrayList<Integer> quantity = new ArrayList<Integer>();
        quantity.add(6);
        quantity.add(67);
        quantity.add(33);
        quantity.add(26);
        quantity.add(9);

        ArrayList<String> uom = new ArrayList<String>();
        uom.add("Wood");
        uom.add("Metal");
        uom.add("Steel");
        uom.add("Rock");
        uom.add("Water");

        int[] CoId = new int[]{1,2,3,4,5};
        String[] CoName = new String[]{"Pikachu Corp.", "Squirtle Corp.", "Bulbasaur Corp.", "Charmander Corp.", "Pidgey Corp."};
        String[] address = new String[]{"Japan", "Los Angeles", "Philippines", "Antartica", "Heaven"};
        String[] phone = new String[]{"222222", "3333333", "4444444", "5555555", "9129404759834"};

        Exercise7Company CO = new Exercise7Company(CoId, CoName, address, phone);

        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(1);
        itemID.add(2);
        itemID.add(3);
        itemID.add(4);
        itemID.add(5);

        ArrayList<String> itemDesc = new ArrayList<String>();
        itemDesc.add("Thunderbold");
        itemDesc.add("Waterfall");
        itemDesc.add("Leech Seed");
        itemDesc.add("Flamethrower");
        itemDesc.add("Whirlwind");

        ArrayList<String> itemType = new ArrayList<String>();
        itemType.add("Attack");
        itemType.add("Defense");
        itemType.add("Rebound");
        itemType.add("Steal");
        itemType.add("Dribble");

        ArrayList<Float> price = new ArrayList<Float>();
        price.add(5.6f);
        price.add(1.98f);
        price.add(4.7f);
        price.add(43.20f);
        price.add(2.76f);


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