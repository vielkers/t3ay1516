package anton.santos.Ex34567;

import java.util.ArrayList;

/**
 * Created by Anton on 6/17/2016.
 */
public class PurchaseOrder {
    public static int count = 1000;
    int  PONumber;
    int [] quantity ;
    String [] UOM;
    Item [] box;
    Company [] vendor;

    public PurchaseOrder( int [] quantity, String [] UOM, Item [] box,Company [] vendor) {
        this.PONumber = count;
        this.quantity  = quantity;
        this.UOM = UOM;
        this.box = box;
        this.vendor = vendor;
        count ++;

    }


    public static String purchase(ArrayList<PurchaseOrder> Purchases){
        String purchasing = "";
        for(int i =0; i< 4;i++){
            purchasing = purchasing
                    + Purchases.get(i).quantity+" "
                    + Purchases.get(i).UOM+ " of "
                    + ItemsPrice.ID.keySet().toArray()[i]+")"
                    + ItemsPrice.itemDesc.get(i)+" = Php "
                    + ItemsPrice.itemPrice.get(i);




        }
        return purchasing;
    }


}

