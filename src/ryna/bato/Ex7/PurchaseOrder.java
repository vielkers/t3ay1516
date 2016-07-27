package ryna.bato.Ex7;

public class PurchaseOrder {
    public static int POsToDate;
    public int PONumber;
    public ryna.bato.Ex7.Company supplier;
    public String date;
    public Item[] products;

    public PurchaseOrder(int PONumber, Company supplier, String date, Item[] products){
        POsToDate++;
        this.PONumber=POsToDate;
        this.supplier=supplier;
        this.date=date;
        this.products=products;
    }

    public float getPOTotal(PurchaseOrder PO){
        float POTotal=0;
        for(int n=0; n<products.length; n++){
            POTotal += Item.getTotal(products[n]);
        }
        return POTotal;
    }

    public boolean isLatestPO(){
        if(POsToDate==this.PONumber){
            return true;
        }
        else {return false;}
    }

    public PurchaseOrder(){
    }

    public static int getPOsToDate() {
        return POsToDate;
    }
    public static void setPOsToDate(int POsToDate) {
        PurchaseOrder.POsToDate = POsToDate;
    }
    public int getPONumber() {
        return PONumber;
    }
    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }
    public Company getSupplier() {
        return supplier;
    }
    public void setSupplier(Company supplier) {
        this.supplier = supplier;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Item[] getProducts() {
        return products;
    }
    public void setProducts(Item[] products) {
        this.products = products;
    }
}
