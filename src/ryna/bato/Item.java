package ryna.bato;

public class Item{
    public static void main(String[] args){
        //PurchaseOrder myPO = new PurchaseOrder();
        //PurchaseOrder[] thePO = new PurchaseOrder[3];
        PurchaseOrder[] myPO = new PurchaseOrder[] {new PurchaseOrder(), new PurchaseOrder(), new PurchaseOrder()};

        int[] itemID = new int[] {112, 113, 114};
        String[] itemDesc = new String[] {"Tupperware Brands Scent endorsed by Maja Salvador", "Tupperware Brands Scent 2", "Tupperware Brands Scent 3"};
        String[] itemType = new String[] {"Celebrity Fragrance", "Celebrity Fragrance 2", "Celebrity Fragrance 3"};
        float[] price = new float[] {139f, 269f, 269f};

        System.out.println("PO NUMBER " + myPO[0].poNumber);

        //hi po sir, di ko pa po masyado gets itong for each na loop :(
       /*for(PurchaseOrder thePO : myPO){
            System.out.println(thePO.getItem());
            System.out.println(thePO.getQuantity());
            System.out.println(thePO.getUom());
        }*/

        //sir, since di ko pa po magawa nang maayos ung for each, di ko muna ginamit lahat ng variables
        //huhu manual sya :(( sorry sir aralin ko na lang po muna ung for each na loop para next time medyo alam ko na po gawin
        System.out.println("\nITEMS (QUANTITY)");
        System.out.println(myPO[0].item[0] + "(" + myPO[0].quantity[0] + ")");
        System.out.println(myPO[0].item[1] + "(" + myPO[0].quantity[1] + ")");
        System.out.println(myPO[0].item[2] + "(" + myPO[0].quantity[2] + ")");

        System.out.println("\nITEM ID (UNIT PRICE)");
        System.out.println(itemID[0] + "(" + price[0] + ")");
        System.out.println(itemID[1] + "(" + price[1] + ")");
        System.out.println(itemID[2] + "(" + price[2] + ")");

        System.out.println("\nTOTAL PRICE");
        System.out.println(myPO[0].quantity[0]*price[0] + myPO[0].quantity[1]*price[1] + myPO[0].quantity[2]*price[2]);
    }
}
