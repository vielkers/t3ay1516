package src.matthew.reyes.Exercise5;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class PurchaseOrder {
    private int PONumber;
    private Company vendor;
    private String date;
    private Item[] items;


    public PurchaseOrder() {
    }

    public PurchaseOrder(int PONumber, Company vendor, String date, Item[] items) {
        this.PONumber = PONumber;
        this.vendor = vendor;
        this.date = date;
        this.items = items;
    }

    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public Company getVendor() {
        return vendor;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }


}
