package carvajal.vielka.Ex4;

/**
 * Created by IE on 7/21/2016.
 */
public class Item {
    private String itemDescription;
    private String itemType;
    private float price;
    private int iD;

    public Item(){
        this.itemDescription = "item";
        this.itemType = "item";
        this.price = 50.00f;
        this.iD = 1000;

    }
    public Item(String itemDescription, String itemType, float price, int iD ) {
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;
        this.iD = iD;
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

    public int getId() {
        return iD;
    }

    public void setId(int iD) {
        this.iD = iD;
    }
}


