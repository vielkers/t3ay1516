package arvin.ymson;


import arvin.ymson.Exercise4.Items;
import arvin.ymson.Exercise5.CompanyEx5;
import arvin.ymson.Exercise6.PurchaseOrderEx6;

/**
 * Created by arvin_000 on 7/27/2016.
 */
public class MainTester {

    public static void main(String[] args) {

        int[] quantity = {1, 2, 3};

        Items[] items = new Items[3];
        items[0] = new Items("dog", 500);
        items[1] = new Items("cat", 1000);
        items[2] = new Items("reindeer", 2000);

        CompanyEx5 petshop = new CompanyEx5("Arvin's Petshop", "SM Megamall", 123456789);


        PurchaseOrderEx6 first = new PurchaseOrderEx6(items, quantity, petshop);
        PurchaseOrderEx6 second = new PurchaseOrderEx6(items, quantity, petshop);


        System.out.println("Your vendor will be: " + first.getVendor().getName());
        System.out.println("Your First PO Number is " + first.getPoNumber());
        System.out.println("Your Second PO Number is " + second.getPoNumber() );


        System.out.println("Current count: " + PurchaseOrderEx6.count);





    }
}
