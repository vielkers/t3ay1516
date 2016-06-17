package aranguren.bernadette;

public class PurchaseOrder {
    public int poNumber;
    public String item;
    public int quantity;
    public String uom;

    public PurchaseOrder() {
        poNumber = 923;
        item = "C2 green tea - Apple flavor";
        quantity = 5;
        uom = "500 ml bottle";
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public int getPoNumber() {
        return this.poNumber;
    }

}
