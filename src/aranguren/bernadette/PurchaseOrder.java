package aranguren.bernadette;

public class PurchaseOrder {
    public int poNumber;
    public String item;
    public int quantity;
    public String uom;

    public PurchaseOrder() {
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
