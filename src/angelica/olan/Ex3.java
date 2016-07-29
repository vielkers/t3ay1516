package angelica.olan;

public class Ex3 {
    private int poNumber;
    private Item item;
    private int qty;
    private String uom;

    public int getPoNum() {
        return poNumber;
    }
    public void setPoNum(int poNum) {
        this.poNumber = poNum;
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
    public Ex3(int poNum, Item item, int qty, String uom){
        this.poNumber = poNum;
        this.item = item;
        this.qty = qty;
        this.uom = uom;
    }
}
