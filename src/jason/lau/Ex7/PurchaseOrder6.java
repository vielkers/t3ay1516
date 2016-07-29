package jason.lau.Ex7;

import jason.lau.Ex3.Items;

import java.util.ArrayList;

/**
 * Created by Jason on 6/7/2016.
 */
public class PurchaseOrder6 {
    public static int count = 1000;
    public int supplier;
    float ponum;
    private ArrayList<Integer> quan;
    private ArrayList<String> uom;
    private ArrayList<Items> cases;


    public PurchaseOrder6() {
        count ++;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PurchaseOrder6.count = count;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    public float getPonum() {
        return ponum;
    }

    public void setPonum(float ponum) {
        this.ponum = ponum;
    }

    public ArrayList<Integer> getQuan() {
        return quan;
    }

    public void setQuan(ArrayList<Integer> quan) {
        this.quan = quan;
    }

    public ArrayList<String> getUom() {
        return uom;
    }

    public void setUom(ArrayList<String> uom) {
        this.uom = uom;
    }

    public ArrayList<Items> getCases() {
        return cases;
    }

    public void setCases(ArrayList<Items> cases) {
        this.cases = cases;
    }


}