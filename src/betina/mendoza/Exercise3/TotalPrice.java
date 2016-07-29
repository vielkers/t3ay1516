package betina.mendoza.Exercise3;

public class TotalPrice {

    private int qty;
    private Item item;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public float getTotalPOAmount(Item item, int qty){
        return item.getPrice() * qty;
    }

    public TotalPrice(int qty, Item item){
        this.qty = qty;
        this.item = item;
    }
}
