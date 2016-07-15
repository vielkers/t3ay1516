package macavinta.gianninah.ex4;

/**
 * Created by IE on 7/15/2016.
 */
public class PurchaseOrder {private int PONumber;
    private item[] item;
    private float[] quantity;
    private String[] unitOfMeasure;

    public PurchaseOrder(int PONumber, item[] item, float[] quantity, String[] unitOfMeasure) {
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

    public item[] getItem() {
        return item;
    }

    public void setItem(item[] item) {
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
}
