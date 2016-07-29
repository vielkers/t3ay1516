package betina.mendoza.Exercise3;


public class Item {
    private int itemID;
    private String itemDescription;
    private String itemType;
    private float price;

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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

    public Item(int itemID, String itemDescription, String itemType, float price){
        this.itemID = itemID;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;
    }
}
