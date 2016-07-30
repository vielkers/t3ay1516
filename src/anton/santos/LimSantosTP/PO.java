package anton.santos.LimSantosTP;

import java.util.ArrayList;

/**
 * Created by Anton on 7/28/2016.
 */
/* PURCHASE ORDER
(See the comment on the PR class first)
Once the purchaser gets the PR and finds a suitable quote from a supplier, the purchaser then generates
a PO, which acts as a contract between the buyer and the seller regarding what items are to be delivered,
by when, and how much the buyer will pay for them.

Typically, a supplier never begins production without a PO from the buyer unless they're trusted, as they
would have no legally binding agreement regarding the deal.

YOU CAN ONLY MAKE A PO FROM AN EXISTING PR.
*/

public class PO {

    //A list of the things the person wants to buy.
    ArrayList<Items> items;
    //These next 2 are for setting the PR number, which is auto generated.
    static int poNumCount;
    String requesting;
    Supplier supplier;

    //Constructor for inputting values in a PO.
    //Method for listing identifying elements of the PO.


    public static String listPO (ArrayList<Supplier> POs){
        String POlist = "";
        for (int i = 0; i < Supplier.poCounter; i++) {
            POlist = POlist
                    +"=================================\n"
                    +"Reference PR Number: "+POs.get(i).pReference
                    +"\nPO Number: "+POs.get(i).poCount
                    +"\nSupplier ID: " +POs.get(i).id
                    +"\nSupplier Name: "+POs.get(i).name
                    +"\nSupplier Address: "+POs.get(i).address
                    +"\nItem Name :"+POs.get(i).iName
                    +"\nItem Qty: "+ POs.get(i).qty
                    +"\nTotal Cost: Php "+POs.get(i).cost+
                    "\n\n";
        }
        return POlist;
    }





    //Method for getting total price of the PO.
    public static double totPrice(ArrayList<Items> stuff){
        double totPrice = 0;

        for (int n = 0; n<stuff.size(); n++){
            totPrice = Utilities.onePrice(stuff.get(n)) + totPrice;
        }

        return totPrice;
    }
}