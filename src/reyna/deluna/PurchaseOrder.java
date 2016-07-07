package reyna.deluna;

public class PurchaseOrder {

    public static int POsToDate;
    public int num = 001;
    String[] descr = new String[] {"Toshiba Canvio Ready 3.0 1TB Portable Hard", "Olay Night Ritual", "Nestle Koko Krunch 500g"};
    int[] qty = new int[] {1, 2, 5};
    String[] uom = new String[] {"EA", "BT", "PK"};

    public PurchaseOrder(int num, String[] descr, int[] qty, String[] uom) {
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