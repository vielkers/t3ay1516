package jason.lau.Ex7;

import jason.lau.Ex3.Items;
import jason.lau.Ex3.PurchaseOrder;
import jason.lau.Ex7.Company;

import java.util.ArrayList;

/**
 * Created by Jason on 6/10/2016.
 */

public class CompanyPO {
    public static void main(String[] args) {
        float sum;
        float total = 0;
        String Date = "July 1, 2016";
        int PONUM = 123;

//Company
        int[] ID = new int[]{1001, 1002, 1003, 1004, 1005};
        String[] Name = new String[]{"Unilever", "Nestle", "URC", "San Miguel", "P&G"};
        String[] Add = new String[]{"Paco", "Makati", "Ortigas", "Bulacan", "Fort"};
        String[] Num = new String[]{"12345", "67890", "45678", "12390", "26673"};
        Company Jason = new Company(ID, Name,Add, Num);

//PO
        ArrayList<String> cases = new ArrayList<String>();
        cases.add("Dove");
        cases.add("Crunch");
        cases.add("Piattos");
        cases.add("San Mig Light");
        cases.add("Gillette");

        ArrayList<Integer> quan = new ArrayList<Integer>();
        quan.add(9);
        quan.add(20);
        quan.add(50);
        quan.add(36);
        quan.add(5);

        ArrayList<String> uom = new ArrayList<String>();
        uom.add("Bottles");
        uom.add("Bars");
        uom.add("Pack");
        uom.add("Cases");
        uom.add("Product");

        PurchaseOrder6 Here = new PurchaseOrder6();

 //Item
        ArrayList<Integer> id = new ArrayList<Integer>();
        id.add(987);
        id.add(654);
        id.add(321);
        id.add(102);
        id.add(546);

        ArrayList<String> desc = new ArrayList<String>();
        desc.add("Dove");
        desc.add("Crunch");
        desc.add("Piattos");
        desc.add("San Mig Light");
        desc.add("Gillette");

        ArrayList<String> type = new ArrayList<String>();
        type.add("Shampoo");
        type.add("Chocolate");
        type.add("Chips");
        type.add("Beer");
        type.add("Razor");

        ArrayList<Float> price = new ArrayList<Float>();
        price.add(224.1f);
        price.add(50.00f);
        price.add(14.99f);
        price.add(273.50f);
        price.add(199.99f);

        System.out.println("Welcome");
        System.out.println("Here is your Purchase Order");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Date: " + Date);
        System.out.println("PO Number: " + PONUM);
        System.out.println("===========================================================================================================================================================");
        System.out.printf("%-10s %-13s %-10s %-10s %-10s %-14s %-12s %-10s %-12s %-10s %-10s \n",
                "COMPANY #", "COMPANY", "ADDRESS", "PHONE #", "ITEM ID", "ITEM DESC", "ITEM TYPE", "UOM", "PRICE",
                "QUANTITY", "AMOUNT");
        System.out.println("===========================================================================================================================================================");
        int j;
        for(j = 0; j < 5; j++){

            System.out.printf("%-10s %-13s %-10s %-10s %-10s %-14s %-12s %-10s %-12s %-10s %-10s \n",
                    ID[j], Name[j], Add[j], Num[j], id.get(j), desc.get(j),
                    type.get(j), uom.get(j), price.get(j), quan.get(j), price.get(j)*quan.get(j));
        }

        for(j = 0; j < 5; j++) {
            sum = price.get(j)*quan.get(j);
            total = total + sum;
        }
        System.out.println("===========================================================================================================================================================");
        System.out.println("TOTAL PRICE: " + "$" + total);

        System.out.println("===========================================================================================================================================================");
        if((Here.ponum) == PurchaseOrder6.count -1 ) {

            System.out.println("Latest Purchase Order!");
        }

        else System.out.println("There are still other Purchase Orders!");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
