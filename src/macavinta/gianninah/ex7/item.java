package macavinta.gianninah.ex7;

public class item {
    private String itemDescription;
    private String itemType;
    private int iD;
    private float price;

    public item() {
        this.itemDescription = "item";
        this.itemType = "item";
        this.iD = 12345;
        this.price = 50000.00f;
    }

    public item(String itemDescription, String itemType, int iD, float price) {
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