package tommy.lim.Ex5;

/**
 * Created by IE on 6/28/2016.
 */
public class PO5 {
    public static int count = 5000;
    int ponumber;
    float[] quantity1;
    String[] UOM;
    Item5[] products;

    public PO5(int ponumber, float[] quantity, String[] UOM, Item5[] products) {
        this.ponumber = ponumber;
        this.quantity1 = quantity;
        this.UOM = UOM;
        this.products = products;
        count ++;
    }

    public int getPonumber() {
        return ponumber;
    }

    public void setPonumber(int ponumber) {
        this.ponumber = ponumber;
    }

    public float[] getQuantity() {
        return quantity1;
    }

    public void setQuantity(float[] quantity) {
        this.quantity1 = quantity;
    }

    public String[] getUOM() {
        return UOM;
    }

    public void setUOM(String[] UOM) {
        this.UOM = UOM;
    }

    public Item5[] getProducts() {
        return products;
    }

    public void setProducts(Item5[] products) {
        this.products = products;
    }
}
