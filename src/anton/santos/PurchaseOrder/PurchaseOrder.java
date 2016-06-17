package anton.santos.PurchaseOrder;

/**
 * Created by Anton on 6/17/2016.
 */
public class PurchaseOrder {
    int PONumber;
    int [] quantity ;
    String [] UOM;
    Item [] box;


    public PurchaseOrder(int PONumber, int [] quantity, String [] UOM, Item [] box) {
        this.PONumber = PONumber;
        this.quantity  = quantity;
        this.UOM = UOM;
        this.box = box;
    }

    public float getTotalPOPrice(){
        return box[1].getPrice()* quantity[2];
    }
}

