package macavinta.gianninah.ex6;

/**
 * Created by IE on 7/15/2016.
 */
public class PurchaseOrder {public static int numPOCreated;
    private int POCount;
    private int PONumber;
    private Item[] item;
    private float[] quantity;
    private String[] unitOfMeasure;

    public PurchaseOrder(int PONumber, Item[] item, float[] quantity, String[] unitOfMeasure) {
        this.numPOCreated++;
        this.POCount = numPOCreated;
        this.PONumber = PONumber;
        this.item = item;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public float[] getQuantity() {
        return quantity;
    }

    public void setQuantity(float[] quantity) {
        this.quantity = quantity;
    }

    public String[] getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String[] unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public boolean IsLatestCreated() {
        if (this.POCount == numPOCreated) {
            return true;
        }
        else return false;
    }
}
