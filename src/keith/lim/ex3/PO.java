package keith.lim.ex3;

/**
 * Created by kiiiiibble on 7/20/2016.
 */
public class PO {
    private int PONumber;
    private keith.lim.ex3.Item item;
    private float quantity;
    private String unitOfMeasure;

    public PO(int PONumber, Item item, float quantity, String unitOfMeasure) {
        this.PONumber = PONumber;
        this.item = item;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONumber() {
        return PONumber;
    }

    public Item getItem() {
        return item;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
