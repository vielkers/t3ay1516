package keith.lim.Project;
//DONE

import keith.lim.Project.Items;
import java.util.ArrayList;

/**
 * Created by kiiiiibble on 7/22/2016.
 */

/* PURCHASE REQUISITION
A PR is a form sent from someone inside the company to the purchasing department.
Basically, it says "someone inside the company wants to order these things."
The purchaser then looks for suppliers and gets quotes that fulfill the needs
of the internal person.
*/

public class PR {

    //A list of the things the person wants to buy.
    ArrayList<Items> items;
    //These next 2 are for setting the PR number, which is auto generated.
    static int prNumCount;
    int prNum;
    //shadowNumber is for determining whether the PR will show up in the view data or not.
    //It will be set to 0 when the PR has already been turned into a PO.
    int shadowNum;
    //The person/department requesting for the thing.
    String requesting;

    //Make a new PR. Note that the pr# is automated.
    //Note when constructing the items in the PR to only input 3 fields
    //Use the Items(String item, double qty, String uom) constructor
    //so you don't have prices on the PR.
    public PR(ArrayList<Items> items, String requesting) {
        this.items = items;
        prNumCount++;
        this.prNum = prNumCount;
        this.shadowNum = prNumCount;
        this.requesting = requesting;
    }

    //Function for giving a string of items for the given PR.
    public static String listItems(ArrayList<Items> items) {
        String itemList = "";

        //Loops through each of the items for the PR. Prints it out in this way:
        //Foil - 5 rolls
        //Poop - 2 buckets
        for(int i = 0; i<items.size(); ++i) {
            itemList = itemList + items.get(i).item + " - " + items.get(i).qty + " " + items.get(i).uom + "\n";
        }
        return itemList;
    }

}
