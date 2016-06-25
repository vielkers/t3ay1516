package anton.santos.PurchaseOrder;

/**
 * Created by Anton on 6/17/2016.
 */
public class PurchaseOrder {
    public static int count = 1000;
    int  PONumber;
    int [] quantity ;
    String [] UOM;
    Item [] box;


    public PurchaseOrder( int [] quantity, String [] UOM, Item [] box) {
        this.PONumber = count;
        this.quantity  = quantity;
        this.UOM = UOM;
        this.box = box;
        count ++;


    }

    public float getTotalPOPrice(){
        return box[1].getPrice()* quantity[2];
    }
}

