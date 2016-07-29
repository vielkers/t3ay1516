package tommy.lim.Ex6;
import tommy.lim.Ex5.Item5;
/**
 * Created by IE on 7/29/2016.
 */
public class PO6 {

    int ponumber;
    float[] quantity1;
    String[] UOM;
    Item5[] products;

    public PO6(int ponumber, float[] quantity, String[] UOM, Item5[] products) {
        this.ponumber = ponumber;
        this.quantity1 = quantity;
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
