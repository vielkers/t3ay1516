package jason.lau.Ex5;

import jason.lau.Ex5.Items;
import jason.lau.Ex5.PurchaseOrder4;

/**
 * Created by Jason on 6/10/2016.
 */

public class CompanyPO {

    public static void main(String args[]) {
        int i = 1, ponum = 1111, quantity = 4;
        String uom  = "pcs", Date = "July 1, 2016";
        Items cases = new Items(1111, "Item Description", "Item Type", 947f, 4);
        Company vendor = new Company(1001,"Lau Incorporated","Taft Avenue, Manila, Philippines", "812-52-62");

        System.out.println("--------------------------------------------");
        System.out.println("Welcome!!!");
        System.out.println("--------------------------------------------");

        System.out.println("Company Information");
        System.out.println("--------------------------------------------");
        System.out.println("Company Ref No.: " + vendor.getID());
        System.out.println("Company Name: " +vendor.getName());
        System.out.println("Company Address: " + vendor.getAdd());
        System.out.println("Company Number: " +vendor.getNum());
        System.out.println("--------------------------------------------");

        System.out.println("Date: " + Date);
        System.out.println("--------------------------------------------");

        System.out.println("Purchase Order");
        System.out.println("--------------------------------------------");
        System.out.println("Purchase Order Number: " + ponum);
        System.out.println("Number of Units: " + quantity);
        System.out.println("Unit of Measure: " + uom);
        System.out.println("--------------------------------------------");

        System.out.println("Item");
        System.out.println("--------------------------------------------");
        System.out.println("Item ID: " + cases.getItemid());
        System.out.println("Item Description: " + cases.getItemdesc());
        System.out.println("Item Type: " + cases.getItemty());
        System.out.println("Item Price: PHP " + cases.getPrice());
        System.out.println("--------------------------------------------");


        System.out.println("TOTAL AMOUNT: PHP " + cases.getPrice() * quantity);
    }
}
