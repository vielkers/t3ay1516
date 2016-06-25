package ryna.bato.Ex3;

public class PurchaseOrder {
    public int poNumber = 1234;

    //making these variables into arrays
    //initialization
    public String[] item = new String [] {"Ivana Pink Body Mist", "Ivana Light Blue Body Mist", "Ivana Lovely Body Mist"};
    public int[] quantity = new int [] {20, 10, 5};
    public String[] uom = new String [] {"100 ml, 250 ml, 250 ml"};

    public PurchaseOrder() {
    }

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public String[] getUom() {
        return uom;
    }

    public void setUom(String[] uom) {
        this.uom = uom;
    }
}

