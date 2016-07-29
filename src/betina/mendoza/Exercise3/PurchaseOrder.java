package betina.mendoza.Exercise3;

public class PurchaseOrder {
    private int poNum;
    private Item item;
    private int qty;
    private String uom;

    public int getPoNum() {
        return poNum;
    }

    public void setPoNum(int poNum) {
        this.poNum = poNum;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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

    public PurchaseOrder(int poNum, Item item, int qty, String uom) {
        this.poNum = poNum;
        this.item = item;
        this.qty = qty;
        this.uom = uom;
    }
}