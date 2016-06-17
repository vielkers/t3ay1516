package jason.lau;

/**
 * Created by Jason on 6/7/2016.
 */
public class Items {

    private int itemid;
    private String itemdesc;
    private String itemty;
    private float price;

    public Items(int itemid, String itemdesc, String itemty, float price) {
        this.itemid = itemid;
        this.itemdesc = itemdesc;
        this.itemty = itemty;
        this.price = price;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    public String getItemty() {
        return itemty;
    }

    public void setItemty(String itemty) {
        this.itemty = itemty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    }