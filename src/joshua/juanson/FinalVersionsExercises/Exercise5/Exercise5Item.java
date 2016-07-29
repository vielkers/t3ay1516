package joshua.juanson.FinalVersionsExercises.Exercise5;
public class Exercise5Item
{
    private int itemID;
    private String itemDesc;
    private String itemType;
    private float price;
    private int quantity;
    public Exercise5Item(int itemID, String itemDesc, String itemType, float price, int quantity)
    {
        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.itemType = itemType;
        this.price = price;
        this.quantity = quantity;
    }
    public Exercise5Item(){
        this.itemID = 0;
        this.itemDesc = "Null";
        this.itemType = "Null";
        this.price = 0;
        this.quantity = 0;
    }
    //Different Methods
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
    public int getQuantity() {
        return quantity;
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
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
