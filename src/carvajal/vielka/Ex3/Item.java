package carvajal.vielka.Ex3;

/**
 * Created by IE on 6/17/2016.
 */
public class Item {
    private float price;
    private int itemID;
    private String itemDescription;
    private String itemType;

    public Item (float price, int itemID, String itemDescription, String itemType) {
        this.price = price;
        this.itemID = itemID;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
    }
    public float getPrice() {return price; }

    public void setPrice(float price) { this.price = price; }

    public int getItemID() { return itemID; }

    public void setItemID(int itemID) { this.itemID = itemID; }

    public String getItemDescription() { return itemDescription; }

    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public String getItemType() { return itemType; }

    public void setItemType (String itemType) { this.itemType = itemType; }








}
