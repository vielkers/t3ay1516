package jason.lau.Ex4;

import jason.lau.Ex3.Items;

/**
 * Created by Jason on 6/10/2016.
 */

public class MultiPO {
    public static void main(String[] args) {
        float sum;
        float total = 0;

        Items Dove = new Items(1, "Dove", "Personal Care", 240.01f);
        Items LiptonTea = new Items(2, "LiptonTea", "Drinks", 46.89f);
        Items Surf = new Items(3, "Surf", "Home Care", 9.00f);
        Items Rexona = new Items(4, "Rexona", "Personal Care", 65.45f);

        int [] sarray = {4,5,8,9};
        String [] larray = {"Bottles", "Box", "Bag", "Bottles"};
        Items [] harray = {Dove, LiptonTea, Surf, Rexona};
        PurchaseOrder2 Here = new PurchaseOrder2(1, sarray, larray,harray);

        System.out.print("Purchase Order # ");
        System.out.println(Here.ponum);
        System.out.println("-----------------------------");
        System.out.println("Items: ");

        for(int i = 0; i < 4; i++) {
          System.out.print(Here.quan[i] + " " + Here.uom[i] + " of ");
            System.out.println(Here.cases[i].getItemdesc()+" = Php "+ Here.quan[i]*Here.cases[i].getPrice());

            sum = Here.quan [i] * Here.cases[i].getPrice();
            total = total + sum;
        }

        System.out.println("-----------------------------");
        System.out.println("Total Purchase: " + total);
    }
}

