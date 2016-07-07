package src.matthew.reyes;

/**
 * Created by victorreyes on 07/06/2016.
 */
public class Item {
    private int id;
    private String itemDescription;
    private String itemType;
    private float price;

    public Item () {
        this.id = 9999;
        this.itemDescription = "item";
        this.itemType = "item";
        this.price = 100.00f;
    }

    public Item(int id, String itemDescription, String itemType, float price) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;
    }
    public int getID() {
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
    public void setItemType(String itemtype) {
        this.itemType = itemType;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    }

