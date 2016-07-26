package carvajal.vielka.Ex6;

/**
 * Created by IE on 7/22/2016.
 */
public class PO {
public static int PurchaseOrders;
    private int PONumber;
    private String date;
    private Company vendor;
    private float [] quantitiy;
    private String[] uOM;
    private Item[] item;

    public PO(String date, Company vendor, float[] quantity, String[] uOM, Item[] item){
        PurchaseOrders++;
        this.PONumber = PurchaseOrders;
        this.date = date;
        this.vendor = vendor;
        this.quantitiy = quantity;
        this.uOM = uOM;
        this.item = item;
    }
    public int getPONumber() { return PONumber;}

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }
    public String getDate() { return date;}

    public void setDate(String date) {
        this.date = date;
    }
    public Company getVendor() {return vendor;}

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }
    public float [] getQuantitiy () {return quantitiy;}

    public void setQuantitiy(float[] quantitiy) {
        this.quantitiy = quantitiy;
    }
    public String [] getuOM() {return uOM;}

    public void setuOM(String[] uOM) {
        this.uOM = uOM;
    }

    public Item [] getItem(){ return item;}

    public void setItem(Item[] item) {
        this.item = item;
    }

    public float getTotalPOPrice(){
        float Total = 0;
        for (int i = 0; i < item.length; i++) {
            Total += item[i].getPrice() * quantitiy[i];
        }
        return Total;
    }
    public boolean isCurrentPO() {
        if (PurchaseOrders == this.PONumber ) {
            return true;
        }
        else return false;
    }
}
