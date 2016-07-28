package reyna.deluna.Ex_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by IE on 7/28/2016.
 */
public class Item {
    public static void main(String[] args) {

        HashMap<Integer, Float> hm = new HashMap<>();

        hm.put(1, 2650.75f);
        hm.put(2, 1699.50f);
        hm.put(5, 500.80f);

        Set<Integer> keys = hm.keySet();

        float n = 0;
        float x = 0;

        for (Integer key : keys) {
            n = key * hm.get(key);
            x = x + n;
        }

        System.out.println("PO Number: 1\n");

        ArrayList<String> list = new ArrayList<>();
        list.add("Toshiba Canvio Ready 3.0 1TB Portable Hard");
        list.add("Olay Night Ritual");
        list.add("Nestle Koko Krunch 500g");

        System.out.println("Item Description: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "912646");
        list.set(1, "159863");
        list.set(2, "879652");

        System.out.println("\nItem ID: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "Computers & Laptops");
        list.set(1, "Health & Beauty");
        list.set(2, "Groceries");

        System.out.println("\nItem Type: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "941253");
        list.set(1, "845602");
        list.set(2, "45936");

        System.out.println("\nVendor ID: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "Toshiba");
        list.set(1, "Olay");
        list.set(2, "Nestle");

        System.out.println("\nVendor Name: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "Japan");
        list.set(1, "USA");
        list.set(2, "Philippines");

        System.out.println("\nVendor Address: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "8969586");
        list.set(1, "1598631");
        list.set(2, "7865234");

        System.out.println("\nVendor Phone#: ");
        for (String value : list) {
            System.out.println(value);
        }

        list.set(0, "EA");
        list.set(1, "BT");
        list.set(2, "PK");

        System.out.println("\nQty: ");
        for (Integer key : keys) {
            System.out.println(key);
        }

        System.out.println("\nUOM: ");
        for (String value : list) {
            System.out.println(value);
        }

        System.out.println("\nUnit Price: ");
        for (Integer key : keys) {
            System.out.println(hm.get(key));
        }

        System.out.println("\n---------------\n\nTOTAL PRICE: " + "PHP " + x);
    }
}
