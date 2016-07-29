package src.matthew.reyes.Exercise5;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class PurchaseOrder {
    public int PONumber = 1001;
    public String[] Item = new String[] {"Servers,", "Database", "Website"};
    public int[] Quantity = new int[] {1, 2, 3};
    public String[] UOM = new String[] {"Units", "Units", "Pages"};
    public String date = "May 19, 1994";

    public PurchaseOrder() {

    }

    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public String[] getItem() {
        return Item;
    }

    public void setItem(String[] item) {
        Item = item;
    }

    public int[] getQuantity() {
        return Quantity;
    }

    public void setQuantity(int[] quantity) {
        Quantity = quantity;
    }

    public String[] getUOM() {
        return UOM;
    }

    public void setUOM(String[] UOM) {
        this.UOM = UOM;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
