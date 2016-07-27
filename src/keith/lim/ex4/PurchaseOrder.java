package keith.lim.ex4;

/**
 * Created by kiiiiibble on 7/26/2016.
 */
public class PurchaseOrder {
    private int PONumber;
    private keith.lim.ex4.Item[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    public PurchaseOrder() {
    }

    public PurchaseOrder(int PONumber) {
    }

    public PurchaseOrder(int PONumber, Item[] items) {
    }

    public PurchaseOrder(int PONumber, Item[] items, float[] quantities) {
    }

    public PurchaseOrder(int PONumber, keith.lim.ex4.Item[] items, float[] quantities, String[] unitOfMeasure) {
        this.PONumber = PONumber;
        this.items = items;
        this.quantities = quantities;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public keith.lim.ex4.Item[] getItems() {
        return items;
    }

    public void setItems(keith.lim.ex4.Item[] items) {
        this.items = items;
    }

    public float[] getQuantities() {
        return quantities;
    }

    public void setQuantities(float[] quantities) {
        this.quantities = quantities;
    }

    public String[] getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String[] unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public float getTotalPOPrice() {
        float currentTotal = 0;
        for (int i = 0; i < items.length; i++) {
            currentTotal += items[i].getPrice() * quantities[i];
        }
        return currentTotal;
    }

}