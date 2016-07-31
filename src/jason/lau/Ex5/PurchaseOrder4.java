package jason.lau.Ex5;

import jason.lau.Ex5.Items;

/**
 * Created by Jason on 6/7/2016.
 */

public class PurchaseOrder4 {

    private int ponum;
    private String date;
    private Items [] cases;
    private Company vendor;
    private float [] quantity;
    private String [] uom;

    public PurchaseOrder4(int ponum, String date, Items[] cases, Company vendor, float[] quantity, String[] uom) {
        this.ponum = ponum;
        this.date = date;
        this.cases = cases;
        this.vendor = vendor;
        this.quantity = quantity;
        this.uom = uom;
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

    public Items[] getCases() {
        return cases;
    }

    public void setCases(Items[] cases) {
        this.cases = cases;
    }

    public Company getVendor() {
        return vendor;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public float[] getQuantity() {
        return quantity;
    }

    public void setQuantity(float[] quantity) {
        this.quantity = quantity;
    }

    public String[] getUom() {
        return uom;
    }

    public void setUom(String[] uom) {
        this.uom = uom;
    }

    public float POTotal() {
        float Total = 0;
        for (int i = 0; i < cases.length; i++)
        {
            Total += cases[i].getPrice()*quantity[i];
        }
        return Total;
    }
}
