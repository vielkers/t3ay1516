package reyna.deluna.Ex3;

/**
 * Created by IE on 7/22/2016.
 */
public class PurchaseOrder {
    private int num;
    private int qty;

    public PurchaseOrder(int num, int qty) {
        this.num = num;
        this.qty = qty;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
