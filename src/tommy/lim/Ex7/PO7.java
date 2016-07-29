package tommy.lim.Ex7;
import tommy.lim.Ex5.Item5;

import java.util.ArrayList;
/**
 * Created by IE on 7/29/2016.
 */
public class PO7 {
    public static int count = 1000;
    public int supplier;
    float ponumber;
    private ArrayList<Integer> quantity1;
    private ArrayList<String> UOM;
    private ArrayList<Item5> products;


    public PO7() {
        count ++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PO7.count = count;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    public float getPonumber() {
        return ponumber;
    }

    public void setPonumber(float ponumber) {
        this.ponumber = ponumber;
    }

    public ArrayList<Integer> getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(ArrayList<Integer> quantity1) {
        this.quantity1 = quantity1;
    }

    public ArrayList<String> getUOM() {
        return UOM;
    }

    public void setUOM(ArrayList<String> UOM) {
        this.UOM = UOM;
    }

    public ArrayList<Item5> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Item5> products) {
        this.products = products;
    }
}
