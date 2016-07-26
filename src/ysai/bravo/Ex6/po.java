package ysai.bravo.Ex6;

/**
 * Created by IE on 7/26/2016.
 */
public class po {
    public static int POsToDate;
    public int num = 001;
    String[] descr = new String[] {"Magnum Almond", "Ziploc bag", "Nestle Koko Krunch"};
    int[] qty = new int[] {1, 2, 5};
    String[] uom = new String[] {"EA", "BT", "PK"};

    public po(int num, String[] descr, int[] qty, String[] uom) {
        POsToDate++;
        this.num = POsToDate;
        this.descr = descr;
        this.qty = qty;
        this.uom = uom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getDescr() {
        return descr;
    }

    public void setDescr(String[] descr) {
        this.descr = descr;
    }

    public int[] getQty() {
        return qty;
    }

    public void setQty(int[] qty) {
        this.qty = qty;
    }

    public String[] getUom() {
        return uom;
    }

    public void setUom(String[] uom) {
        this.uom = uom;
    }

    public boolean isLatestPO() {
        if (POsToDate == this.num ) {
            return true;
        } else return false;
    }


}