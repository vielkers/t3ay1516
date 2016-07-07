package ysai.bravo;

/**
 * Created by IE on 6/28/2016.
 */
public class ITEM {
    private int id;
    private String itemDescription;
    private String itemType;
    private float price;

    public ITEM() {
        this.id = 9999;
        this.itemDescription = "item";
        this.itemType = "item";
        this.price = 100.00f;
    }

    public ITEM(int id, String itemDescription, String itemType, float price) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
