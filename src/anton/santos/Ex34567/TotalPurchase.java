package anton.santos.Ex34567;
import anton.santos.LimSantosTP.Supplier;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Anton on 6/17/2016.
 */
public class TotalPurchase {
    //Dictionary

    public static void main(String[] args) {
        ArrayList<PurchaseOrder> Purchases;
        Random r = new Random(System.currentTimeMillis());
        int rand;
        rand = r.nextInt(3);

        float total = 0;
        float sum =0;


        //Dictionary add values
        ItemsPrice.ID.put(0,17.5f);
        ItemsPrice.ID.put(1,45f);
        ItemsPrice.ID.put(2,32.75f);
        ItemsPrice.ID.put(3,29.5f);
        ItemsPrice.itemDesc.put(0,"safeguard");
        ItemsPrice.itemDesc.put(1,"kitkat");
        ItemsPrice.itemDesc.put(2,"twinkies");
        ItemsPrice.itemDesc.put(3,"coke");


        //Items
        Item safeguard = new Item(0, "safeguard", "soap", 17.5f);
        Item kitkat = new Item(1, "kitkat", "chocolate", 45f);
        Item twinkies = new Item(2, "twinkies", "snack back", 32.75f);
        Item coke = new Item(3, "coke","soft drink", 29.5f);

        Company Nestle = new Company(0,"Nestle","Rockwell Avenue","574-23-56");
        Company Unilever = new Company(1,"Unilever","Taft Avenue","412-55-65");
        Company Shell = new Company(2,"Shell","Poopoo Drive","293-53-59");
        Company IBM = new Company(3,"IBM","Stringy Park","477-29-59");

        //PurchaseOrder
        int[] qarray = {3,5,7,4};
        String [] zarray = {"boxes", "bars","wraps" ,"bottles"};
        Item [] narray = {safeguard, kitkat, twinkies, coke};
        Company [] carray = {Nestle, Unilever, Shell, IBM};
        PurchaseOrder First = new PurchaseOrder(qarray,zarray,narray,carray);
        PurchaseOrder Second = new PurchaseOrder(qarray,zarray,narray,carray);
        //First.PONumber = 1001;

        int Total = 0;
        //static ArrayList<PurchaseOrder> orderfinal = new ArrayList<>()

        System.out.print("Purchase order # ");
        System.out.println(First.PONumber);
        System.out.println("Vendor ID: "+First.vendor[0].getVendorid());
        System.out.println("Vendor Name: "+First.vendor[0].getVendorname());
        System.out.println("Vendor Address: "+First.vendor[0].getVendoraddress());
        System.out.println("Your purchases:");


        for(int z=0;z<4;z++){
            //Quantity and Item Desc
            System.out.print(First.quantity[z]+" "+First.UOM[z]+" of ");
            System.out.print("(" + ItemsPrice.ID.keySet().toArray()[z]+")");
            //Price Calculation

            System.out.println(First.box[z].getItemDesc()+" = Php "+ First.quantity[z]*ItemsPrice.ID.get(z));
            //System.out.println(First.box[i].getItemDesc()+" = Php "+ First.quantity[i]*First.box[i].getPrice());



            //sum = First.quantity[i]*First.box[i].getPrice();


            sum = First.quantity[z]*ItemsPrice.ID.get(z);
            total = total + sum;
        }

        System.out.print("Total Amount due is = Php ");
        System.out.println(total);

        if((First.PONumber) == PurchaseOrder.count -1 ) {

            System.out.print("This is the latest PO");
        } else System.out.print("This is not the latest PO");

    }





    }

