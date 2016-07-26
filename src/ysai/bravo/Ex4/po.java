package ysai.bravo.Ex4;

/**
 * Created by IE on 7/26/2016.
 */
public class po {
    private int PONumber;
    private item[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    public po() {
    }

    public po(int PONumber, item[] items, float[] quantities, String[] unitOfMeasure) {
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

    public item[] getItems() {
        return items;
    }

    public void setItems(item[] items) {
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
