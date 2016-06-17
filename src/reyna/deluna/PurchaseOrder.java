package reyna.deluna;

/**
 * Created by IE on 6/17/2016.
 */

public class PurchaseOrder {
    private int num;
    private float qty;

    public PurchaseOrder(int num, float qty) {
        this.num = num;
        this.qty = qty;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }
}
