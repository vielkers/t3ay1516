package macavinta.gianninah.ex3;

/**
 public class purchaseorder {
 }
 * Created by IE on 6/25/2016.
 */
import java.util.ArrayList;

public class purchaseorder {
    int poNo;
    ArrayList<String> Items = new ArrayList<String>();
    int quantity;
    String UOM;

    public purchaseorder(int poNo, ArrayList<String> Items, int quantity, String UOM){
        this.poNo=poNo;
        this.Items=Items;
        this.quantity=quantity;
        this.UOM=UOM;
    }

    public int getPoNo() {
        return poNo;
    }

    public void setPoNo(int poNumber) {
        this.poNo = poNo;
    }

    public ArrayList<String> getItems() {
        return Items;
    }

    public void setItems(ArrayList<String> items) {
        Items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String uOM) {
        UOM = UOM;
    }

}
