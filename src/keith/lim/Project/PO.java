package keith.lim.Project;
import java.util.ArrayList;

import static keith.lim.Project.Utilities.onePrice;

/**
 * Created by kiiiiibble on 7/22/2016.
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
    int poNum;
    //shadowNumber is for determining whether the PR will show up in the view data or not.
    //It will be set to 0 when the PR has already been turned into a PO.
    int shadowNum;
    //The person/department requesting for the thing.
    String requesting;
    Supplier supplier;

    //Constructor for inputting values in a PO.
    //Note for making the items: construct the items with 4 fields to use the
    //public Items(String item, double qty, String uom, double price) constructor.
    //This way may price na sha, unlike yung sa PR which doesn't account price.
    public PO(ArrayList<Items> items, String requesting, Supplier supplier) {

        //NOTE: In the UI, code something that will make a corresponding PR disappear
        //once a PO is made for it. You can use something like:
        /*
        if (shadowNum = 0), don't display
        if (shadowNum>0), display it
        Tapos whenever you make a new PO, set the shadowNum of the PR to 0.
         */

        /* NOTE 2:
        You'll need to m
         */
        this.items = items;
        poNumCount++;
        this.poNum = poNumCount;
        this.shadowNum = poNumCount;
        //TO-DO: Tie this up with the PR number.
        this.requesting = requesting;
        this.supplier = supplier;
    }

    //Function for giving a string of items and prices for the given PO.
    public static String listItems(ArrayList<Items> items) {
        String itemList = "Items Ordered:\n";

        //Loops through each of the items for the PR. Prints it out in this way:
        //Foil - 5 rolls
        //Poop - 2 buckets
        for(int i = 0; i<items.size(); ++i) {
            itemList = itemList + items.get(i).item + " - " + items.get(i).qty + " " + items.get(i).uom + "\n    COST PER PIECE: " + items.get(i).price + "\n";
        }
        return itemList;
    }

    //Method for listing identifying elements of the PO.
    public static String listPO(PO po){
        String poInfo = "";

        poInfo = "Supplier ID: " + po.supplier.id + "\nSupplier Name: " + po.supplier.name + "\nSupplier Address: " + po.supplier.address + "\n\n";

        return poInfo;
    }

    //Method for getting total price of the PO.
    public static double totPrice(ArrayList<Items> stuff){
        double totPrice = 0;

        for (int n = 0; n<stuff.size(); n++){
            totPrice = onePrice(stuff.get(n)) + totPrice;
        }

        return totPrice;
    }
}