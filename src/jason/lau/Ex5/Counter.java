package jason.lau.Ex5;

import jason.lau.Ex3.Items;

/**
 * Created by Jason on 6/10/2016.
 */

public class Counter {
    public static void main(String[] args) {

        float total = 0;
        float sum;

        Items Dove = new Items(1, "Dove", "Personal Care", 240.01f);
        Items LiptonTea = new Items(2, "LiptonTea", "Drinks", 46.89f);
        Items Surf = new Items(3, "Surf", "Home Care", 9.00f);
        Items Rexona = new Items(4, "Rexona", "Personal Care", 65.45f);

        int [] sarray = {4,5,8,9};
        String [] larray = {"Bottles", "Box", "Bag", "Bottles"};
        Items [] harray = {Dove, LiptonTea, Surf, Rexona};
        PurchaseOrder3 Here = new PurchaseOrder3(1, sarray, larray,harray);

        System.out.println("-------------------------------------------");
        System.out.println("WELCOME!");
        System.out.println("-------------------------------------------");

        System.out.print("Your Purchase Order # ");
        System.out.println(Here.ponumber);
        System.out.println("-------------------------------------------");
        System.out.println("Items: ");

        for(int i = 0; i < 4; i++) {
          System.out.print(Here.quantity[i] + " " + Here.uom1[i] + " of ");
            System.out.println(Here.casess[i].getItemdesc()+" = Php "+ Here.quantity[i]*Here.casess[i].getPrice());

            sum = Here.quantity [i] * Here.casess[i].getPrice();
            total = total + sum;
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total Purchase: " + total);
        System.out.println("-------------------------------------------");

        if((Here.ponumber) == PurchaseOrder3.count -1 ) {

            System.out.println("Latest Purchase Order!");
        }

        else System.out.println("There are still other Purchase Orders!");

        System.out.println("-------------------------------------------");
    }
}

