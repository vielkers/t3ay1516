package carvajal.vielka.Ex5;

/**
 * Created by IE on 7/22/2016.
 */
public class PO {
    private String date;
    private String[] uOM;
    private Company vendor;
    private Item[] item;
    private int PONumber;
    private float[] quantity;

    public PO(String date, String[] uOM, Company vendor, Item[] item, int PONumber, float[] quantity) {
        this.date = date;
        this.uOM = uOM;
        this.vendor = vendor;
        this.item = item;
        this.PONumber = PONumber;
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String[] getUOM() {
        return uOM;
    }
    public void setUOM(String[] uOM) {
        this.uOM = uOM;
    }

    public Company getVendor() {
        return vendor;
    }
    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public Item[] getItem() {
        return item;
    }
    public void setItem(Item[] item) {
        this.item = item;
    }

    public int getPONumber() {
        return PONumber;
    }
    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public float[] getQuantity() {
        return quantity;
    }
    public void setQuantity(float[] quantity) {
        this.quantity = quantity;
    }

}
