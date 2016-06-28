package reyna.deluna.Ex3;

/**
 * Created by IE on 6/17/2016.
 */
public class Item {
    private int ID;
    private String descr;
    private String type;
    private float price;
    private String UOM;

    public Item(int ID, String descr, float price, String type, String UOM) {
        this.ID = ID;
        this.descr = descr;
        this.price = price;
        this.type = type;
        this.UOM = UOM;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}