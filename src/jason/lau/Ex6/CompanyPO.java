package jason.lau.Ex6;

import jason.lau.Ex3.Items;
/**
 * Created by Jason on 6/10/2016.
 */

public class CompanyPO {
    public static void main(String[] args) {
        float sum;
        float total = 0;

        Items Dove = new Items(1, "Dove", "Personal Care", 240.01f);
        Items LiptonTea = new Items(2, "LiptonTea", "Drinks", 46.89f);
        Items Surf = new Items(3, "Surf", "Home Care", 9.00f);
        Items Rexona = new Items(4, "Rexona", "Personal Care", 65.45f);

        Company Jason = new Company();
        int [] sarray = {4,5,8,9};
        String [] larray = {"Bottles", "Box", "Bag", "Bottles"};
        Items [] harray = {Dove, LiptonTea, Surf, Rexona};

       PurchaseOrder5 Here = new PurchaseOrder5(1001, sarray, larray, harray);

        System.out.println("Welcome");
        System.out.println("Here is your Purchase Order");
        System.out.println("--------------------------------------------");
        System.out.println("Date:" + Here.getDate());
        System.out.println("PO Number: " + Here.getPonum());
        System.out.println("--------------------------------------------");
        System.out.println("Company Name: " + Jason.getName());
        System.out.println("Location: " + Jason.getAdd());
        System.out.println("Phone Number: " + Jason.getNum());
        System.out.println("--------------------------------------------");
        System.out.println("Items:");

        for(int i = 0; i < 4; i++) {
            System.out.print(Here.quan[i] + " " +Here.uom[i] + " of ");
            System.out.println(Here.cases[i].getItemdesc() +" = Php "+ Here.quan[i]*Here.cases[i].getPrice());
            sum = Here.quan [i] * Here.cases[i].getPrice();
            total = total + sum;
        }
        System.out.println("--------------------------------------------");
        System.out.println("Total Purchase: " + total);

        System.out.println("--------------------------------------------");
        if((Here.ponum) == PurchaseOrder5.count -1 ) {

            System.out.println("Latest Purchase Order!");
        }

        else System.out.println("There are still other Purchase Orders!");

        System.out.println("-------------------------------------------");

    }

}