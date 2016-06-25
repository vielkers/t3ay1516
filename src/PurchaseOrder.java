package keith.lim;

public class PurchaseOrder {

    int poNumber;
    int qty;
    String uom;

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public PurchaseOrder(int poNumber, int qty, String uom) {
        this.poNumber = poNumber;
        this.qty = qty;
        this.uom = uom;
    }

}