package tommy.lim.Ex7;


import java.util.ArrayList;
/**
 * Created by IE on 7/29/2016.
 */
public class getPO2 {
    public static void main(String[] args) {

        float sum = 0;
        float total = 0;
        int number = 784;


        ArrayList<Integer> id = new ArrayList<Integer>();
        id.add(100);
        id.add(200);
        id.add(300);
        id.add(400);
        id.add(500);

        ArrayList<String> name = new ArrayList<String>();
        name.add("Nestle");
        name.add("Shell");
        name.add("Asia Brewery");
        name.add("Unilever");
        name.add("Nissan");

        ArrayList<String> address = new ArrayList<String>();
        address.add("Manila");
        address.add("Pasay");
        address.add("Malate");
        address.add("BGC");
        address.add("Quezon City");

        ArrayList<String> phone = new ArrayList<String>();
        phone.add("48917321");
        phone.add("78231278");
        phone.add("34789189");
        phone.add("14781782");
        phone.add("12389341");

        ArrayList<String> products = new ArrayList<String>();
        products.add("KitKat");
        products.add("V Power Nitro");
        products.add("Pale Pilsen");
        products.add("Rexona");
        products.add("Sentra");

        ArrayList<Integer> quantity1 = new ArrayList<Integer>();
        quantity1.add(10);
        quantity1.add(20);
        quantity1.add(30);
        quantity1.add(40);
        quantity1.add(50);

        ArrayList<String> UOM = new ArrayList<String>();
        UOM.add("Pieces");
        UOM.add("Litters");
        UOM.add("Bottles");
        UOM.add("Pieces");
        UOM.add("Unit");

        PO7 okay = new PO7();

        ArrayList<Integer> itemid = new ArrayList<Integer>();
        itemid.add(111);
        itemid.add(222);
        itemid.add(333);
        itemid.add(444);
        itemid.add(555);

        ArrayList<String> description = new ArrayList<String>();
        description.add("KitKat");
        description.add("V Power Nitro");
        description.add("Pale Pilsen");
        description.add("Rexona");
        description.add("Sentra");

        ArrayList<String> type = new ArrayList<String>();
        type.add("Chocolate");
        type.add("Oil");
        type.add("Beer");
        type.add("Deodorant");
        type.add("Car");

        ArrayList<Float> price = new ArrayList<Float>();
        price.add(123.4f);
        price.add(567.8f);
        price.add(912.3f);
        price.add(456.7f);
        price.add(891.2f);



        System.out.println("PO Number: " + number);
        System.out.printf("%-10s %-13s %-10s %-10s %-10s %-14s %-12s %-10s %-12s %-10s %-10s \n",
                "COMPANY #", "COMPANY", "ADDRESS", "PHONE #", "ITEM ID", "ITEM DESC", "ITEM TYPE", "UOM", "PRICE",
                "QUANTITY", "AMOUNT");
        System.out.println("===========================================================================================================================================================");
        int j;
        for(j = 0; j < 10; j++){

            System.out.printf("%-10s %-13s %-10s %-10s %-10s %-14s %-12s %-10s %-12s %-10s %-10s \n",
                    id.get(j), name.get(j), address.get(j), phone.get(j), itemid.get(j), description.get(j),
                    type.get(j), UOM.get(j), price.get(j), quantity1.get(j), price.get(j)*quantity1.get(j));
        }

        for(j = 0; j < 10; j++) {
            sum = price.get(j)*quantity1.get(j);
            total = total + sum;
        }
        System.out.println("TOTAL PRICE: " + "$" + total);


        if ((okay.ponumber) == PO7.count - 1) {
            System.out.print("It is the latest purchase order!");
        } else
            System.out.print("It is not the latest purchase order!");

    }




}
