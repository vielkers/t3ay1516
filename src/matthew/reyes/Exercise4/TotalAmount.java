package matthew.reyes.Exercise4;

/**
 * Created by victorreyes on 28/06/2016.
 */
public class TotalAmount {
    private int PONumber;
    private String UOM;
    private float quantity;
    private Item item;


    public TotalAmount(int PONumber, String UOM, float quantity, Item item) {
        this.PONumber = PONumber;
        this.UOM = UOM;
        this.quantity = quantity;
        this.item = item;
    }

    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

}
