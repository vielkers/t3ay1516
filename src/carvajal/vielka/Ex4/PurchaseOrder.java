package carvajal.vielka.Ex4;

/**
 * Created by IE on 7/21/2016.
 */
public class PurchaseOrder {
    private Item[] item;
    private String[] uOM;
    private float[] quantity;
    private int[] PONumber;

    public PurchaseOrder(int[] PONumber, Item[] item, float[] quantity, String[] uOM) {
        this.item = item;
        this.uOM = uOM;
        this.quantity = quantity;
        this.PONumber = PONumber;

    }
    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] items) {
        this.item = items;
    }

    public String[] getuOM() {
        return uOM;
    }

    public void setuOM(String[] unitOfMeasure) {
        this.uOM = uOM;
    }

    public float[] getQuantity() {
        return quantity;
    }

    public void setQuantity(float[] quantities) {
        this.quantity = quantities;
    }

    public int[] getPONumber() {
        return PONumber;
    }

    public void setPONumber(int[] PONumber) {
        this.PONumber = PONumber;
    }



    public float getTotalPOPrice() {
        float currentTotal = 0;
        for (int i = 0; i < item.length; i++) {
            currentTotal += item[i].getPrice() * quantity[i];
        }
        return currentTotal;
    }
}
