package tommy.lim;

/**
 * Created by IE on 6/7/2016.
 */
public class PO {
    private int ponumber;
    private float quantity;

    public PO(int ponumber, float quantity) {
        this.ponumber = ponumber;
        this.quantity = quantity;
    }

    public int getPonumber() {
        return ponumber;
    }

    public void setPonumber(int ponumber) {
        this.ponumber = ponumber;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
