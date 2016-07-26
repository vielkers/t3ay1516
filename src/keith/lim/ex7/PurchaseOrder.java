package keith.lim.ex7;

/**
 * Created by kiiiiibble on 7/20/2016.
 */
public class PurchaseOrder {

    public static int POsToDate;
    private int PONumber;
    private keith.lim.ex7.Company vendor;
    private String date;
    private Item[] items;

    public PurchaseOrder() {
    }

    public PurchaseOrder(int PONumber, Company vendor, String date, Item[] items) {
        POsToDate++;
        this.PONumber = POsToDate;
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

    public float getPOTot (PurchaseOrder PO){
        float POTot = 0;
        for(int n=0; n<items.length; n++ ){
            POTot += Item.getTotal(items[n]);
        }
        return POTot;
    }

    public boolean isLatestPO() {
        if (POsToDate == this.PONumber ) {
            return true;
        } else {return false;}
    }
}