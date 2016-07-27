package ryna.bato.Ex5;

<<<<<<< HEAD
/**
 * Created by Admin on 7/26/2016.
 */
public class Main {
=======
public class Main {
    public static void main (String[] args){
        //System.out.println("Test print");

        System.out.println("YOUR PURCHASE ORDER");

        Company refCom = new Company ();
        Item refItem = new Item ();
        PurchaseOrder refPO = new PurchaseOrder ();

        System.out.println("DATE: " +refPO.getDate());
        System.out.println("PO NUMBER: " +refPO.getPoNumber());

        System.out.println("COMPANY NAME: " + refCom.getName());
        System.out.println("LOCATION: " +refCom.getAddress());
        System.out.println("PHONE: " +refCom.getPhone() + "\n");

        System.out.println("ITEM ID: " +refItem.getId());
        System.out.println("ITEM DESC: " +refItem.getItemDescription());
        System.out.println("ITEM TYPE: " +refItem.getItemType());
        System.out.println("ITEM PRICE: " +refItem.getPrice() + "\n");

    }
>>>>>>> 547180dea152c1c8037d6708df5c0d5c870b2ddd
}
