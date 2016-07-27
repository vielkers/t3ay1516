package ryna.bato.Ex7;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        //System.out.println("Test print");

        System.out.println("YOUR PURCHASE ORDER");

        Company refCom = new Company ();
        //Item. refItem = new Item ();
        PurchaseOrder refPO = new PurchaseOrder ();

        System.out.println("DATE: " +refPO.getDate());
        System.out.println("PO NUMBER: " +refPO.getPONumber());

        System.out.println("COMPANY NAME: " + refCom.getName());
        System.out.println("LOCATION: " +refCom.getAddress());
        System.out.println("PHONE: " +refCom.getPhone() + "\n");

        //System.out.println("ITEM ID: " +refItem.getId());
        //System.out.println("ITEM DESC: " +refItem.getItemDescription());
        //System.out.println("ITEM TYPE: " +refItem.getItemType());
        //System.out.println("ITEM PRICE: " +refItem.getPrice() + "\n");

        System.out.println("IS LATEST PO?: " +refPO.isLatestPO() + "\n");

        ArrayList<String> itemID = new ArrayList<String>();
        ArrayList<String> itemDescription = new ArrayList<String>();
        ArrayList<String> itemType = new ArrayList<String>();

        itemID.add("1");
        itemID.add("2");
        itemID.add("3");

        itemDescription.add("Cologne 1");
        itemDescription.add("Cologne 2");
        itemDescription.add("Cologne 3");

        itemType.add("High End");
        itemType.add("Ordinary Scent");
        itemType.add("Affordable");

        System.out.println("ITEM ID: " + itemID);
        System.out.println("ITEM Description: " + itemDescription);
        System.out.println("ITEM Type: " + itemType);
    }
}
