package tommy.lim.Ex4;

/**
 * Created by IE on 6/25/2016.
 */
public class PO {
    int ponumber;
    float[] quantity;
    String[] UOM;
    Item[] products;

    public PO(int ponumber, float[] quantity, String[] UOM, Item[] products) {
        this.ponumber = ponumber;
        this.quantity = quantity;
        this.UOM = UOM;
        this.products = products;
    }

    public int getPonumber() {
        return ponumber;
    }

    public void setPonumber(int ponumber) {
        this.ponumber = ponumber;
    }

    public float[] getQuantity() {
        return quantity;
    }

    public void setQuantity(float[] quantity) {
        this.quantity = quantity;
    }

    public String[] getUOM() {
        return UOM;
    }

    public void setUOM(String[] UOM) {
        this.UOM = UOM;
    }

    public Item[] getProducts() {
        return products;
    }

    public void setProducts(Item[] products) {
        this.products = products;
    }

}
