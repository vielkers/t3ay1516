package aranguren.bernadette;

public class PurchaseOrderEx3 {
    public int poNumber;
    public String item;
    public int quantity;
    public String uom;

    public PurchaseOrderEx3() {
        poNumber = 923;
        item = "Cream Bowl";
        quantity = 24;
        uom = "EA";
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }
    public String getItem() {
        return item;
    }
}