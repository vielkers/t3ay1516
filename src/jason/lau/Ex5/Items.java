package jason.lau.Ex5;

/**
 * Created by Jason on 6/7/2016.
 */


public class Items {

    private int itemid;
    private String itemdesc;
    private String itemty;
    private float price;
    private float quan;

    public Items(int itemid, String itemdesc, String itemty, float price, float quan) {
        this.itemid = itemid;
        this.itemdesc = itemdesc;
        this.itemty = itemty;
        this.price = price;
        this.quan = quan;
    }

    public Items() {
        this.itemid = 0;
        this.itemdesc = "Null";
        this.itemty = "Null";
        this.price = 0;
        this.quan = 0;
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
