package jason.lau.Ex6;

import jason.lau.Ex5.Company;
import jason.lau.Ex5.Items;

/**
 * Created by Jason on 6/7/2016.
 */

public class PurchaseOrder5 {

    public static int count;
    private int ponum;
    private String date;
    private float quantity;
    private String uom;

    public PurchaseOrder5(int ponum, String date, float quantity, String uom) {
        this.ponum = ponum;
        this.date = date;
        this.quantity = quantity;
        this.uom = uom;
        count ++;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PurchaseOrder5.count = count;
    }

    public int getPonum() {
        return ponum;
    }

    public void setPonum(int ponum) {
        this.ponum = ponum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public boolean latestPurchaseOrder()
    {
        if(count == count)
        {
            return true;
        }
        else
            return false;
    }
}

