package aranguren.bernadette;

public class PurchaseOrder {
    public int poNumber = 923;

    String[] item = new String[]{"Cream Bowl","Hand Towel","Overnight Kit","1/1 Traymat","White Seal"};
    int[] quantity = new int[]{24, 50, 100, 2, 3};
    String[] uom = new String[]{"EA", "BX", "ST", "CS", "TH"};

    public PurchaseOrder(int poNumber, String[] item, int[] quantity, String[] uom) {
        this.poNumber = poNumber;
        this.item = item;
        this.quantity = quantity;
        this.uom = uom;
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
