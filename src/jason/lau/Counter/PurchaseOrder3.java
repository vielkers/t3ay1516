package jason.lau.Counter;

import jason.lau.Ex3.Items;

/**
 * Created by Jason on 6/7/2016.
 */
public class PurchaseOrder3 {
    public static int count = 1000;
    float ponumber;
    int[] quantity;
    String[] uom1;
    Items[] casess;

    public PurchaseOrder3(float ponumber, int[] quantity, String[] uom1, Items[] casess) {
        this.ponumber = ponumber;
        this.quantity = quantity;
        this.uom1 = uom1;
        this.casess = casess;
        count ++;
    }

    public float getPonumber() {
        return ponumber;
    }

    public void setPonumber(float ponumber) {
        this.ponumber = ponumber;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public String[] getUom1() {
        return uom1;
    }

    public void setUom1(String[] uom1) {
        this.uom1 = uom1;
    }

    public Items[] getCasess() {
        return casess;
    }

    public void setCasess(Items[] casess) {
        this.casess = casess;
    }
}