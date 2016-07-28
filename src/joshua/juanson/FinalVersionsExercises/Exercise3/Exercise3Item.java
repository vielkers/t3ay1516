package joshua.juanson.FinalVersionsExercises.Exercise3;

public class Exercise3Item {
    private int itemID;
    private String itemDesc;
    private String itemType;
    private float price;
    private int qty;
    public Exercise3Item(int itemID, String itemDesc, String itemType, float price, int qty) {
        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.itemType = itemType;
        this.price = price;
        this.qty = qty;
    }
    public Exercise3Item(){
        this.itemID = 0;
        this.itemDesc = "Null";
        this.itemType = "Null";
        this.price = 0;
        this.qty = 0;
    }

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

    public int getQty() {
        return qty;
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

    public void setQty(int qty) {
        this.qty = qty;
    }
}
