package keith.lim;

public class Item {

    int itemID;
    String itemDesc;
    String itemType;
    float price;
    int qty;
    String uom;

    public int getItemID() {
        return itemID;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getItemType() {
        return itemType;
    }

    public float getPrice() {
        return price;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Item(int itemID, String itemDesc, String itemType, float price) {
        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.itemType = itemType;
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Item(int itemID, String itemDesc, String itemType, float price, int qty, String uom) {
        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.itemType = itemType;
        this.price = price;
        this.qty = qty;
        this.uom = uom;
    }
}
