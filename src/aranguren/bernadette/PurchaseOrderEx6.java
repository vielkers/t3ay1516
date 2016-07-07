package aranguren.bernadette;

/**
 * Created by Bernadette on 6/25/2016.

public class PurchaseOrderEx6 {
    public static int POsToDate; //counter
    private int PONumber;
    private CompanyEx6 vendor;
    private String date;
    private ItemEx6[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    public PurchaseOrderEx6() {
    }


    public PurchaseOrderEx6(int PONumber, CompanyEx6 vendor, String date, ItemEx6[] items, float[] quantities, String[] unitOfMeasure) {
        if (POsToDate == 0){
            POsToDate++;
        }
        this.PONumber = POsToDate;
        POsToDate++;
        this.vendor = vendor;
        this.date = date;
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

    public ItemEx6[] getItems() {
        return items;
    }

    public void setItems(ItemEx6[] items) {
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

    public CompanyEx6 getVendor() {
        return vendor;
    }

    public void setVendor(CompanyEx6 vendor) {
        this.vendor = vendor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTotalPOPrice() {
        float currentTotal = 0;
        for (int i = 0; i < items.length; i++) {
            currentTotal += items[i].getPrice() * quantities[i];
        }
        return currentTotal;
    }

    public boolean isLatestPO(){
        if ((POsToDate - 1) == this.PONumber)
            return true;
    } else return false;

}
*/