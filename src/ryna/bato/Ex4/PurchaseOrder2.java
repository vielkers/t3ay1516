package ryna.bato.Ex4;

public class PurchaseOrder2
{
    public int poNumber;
    public String item;
    public int quantity ;
    public String uom;

    public PurchaseOrder2(){
        poNumber = 1234;
        item = "Ivana Pink Body Mist (on promo June 1-30, 2016)";
        quantity = 12;
        uom = "100 ml bottle";
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
