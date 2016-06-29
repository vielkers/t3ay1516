package matthew.reyes.Exercise4;

/**
 * Created by victorreyes on 28/06/2016.
 */
public class Item {
    private int itemId;
    private String itemDescription;
    private String itemType;
    private float price;

    public Item() {
        this.itemId = 1001;
        this.itemDescription = "Palmolive";
        this.itemType = "Shampoo";
        this.price = 75.70f;
    }

    public Item(int itemId, String itemDescription, String itemType, float price) {
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;



    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
