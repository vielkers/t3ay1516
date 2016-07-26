package ysai.bravo.Ex5;

import ysai.bravo.Ex5.ITEM;

/**
 * Created by IE on 6/28/2016.
 */
public class PO {
    private int PONumber;
    private ITEM[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    public PO() {
    }

    public PO(int PONumber, ITEM[] items, float[] quantities, String[] unitOfMeasure) {
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

    public ITEM[] getItems() {
        return items;
    }

    public void setItems(ITEM[] items) {
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
