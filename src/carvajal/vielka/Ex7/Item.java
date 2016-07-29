package carvajal.vielka.Ex7;

/**
 * Created by IE on 7/28/2016.
 */
public class Item {
    private String itemDescription;
    private String itemType;
    private int iD;
    private float price;

    public Item() {
        this.itemDescription = "item";
        this.itemType = "item";
        this.iD = 1000;
        this.price = 50.00f;
    }

    public Item(String itemDescription, String itemType, int iD, float price) {
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.iD = iD;
        this.price = price;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getID() {
        return iD;
    }
    public void setID(int iD) {
        this.iD = iD;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
