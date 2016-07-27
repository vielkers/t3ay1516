package keith.lim.Project;
import java.util.ArrayList;

/**
 * Created by kiiiiibble on 7/26/2016.
 */

//For testing if other functions work.
public class Testing {

    public static void main(String[] args){

        //TESTING: Printing out item contents in PR.
        ArrayList<Items> itemlist = new ArrayList<Items>();
        itemlist.add(new Items("Book", 2, "shelf", 50));
        itemlist.add(new Items("Poop", 1, "Bucket", 120));

        PR sample = new PR(itemlist, "Nerds at the Library"  );

        System.out.println(PR.listItems(itemlist));

        //clear line for next test.
        System.out.println("\n============");

        //Testing PO item contents printout.
        Supplier n = new Supplier(1, "Person A", "Poo poo street");
        PO poop = new PO(itemlist, "Manila", n);
        System.out.println(PO.listPO(poop) + PO.listItems(itemlist) + "\nTOTAL COST: " + "" + PO.totPrice(poop.items));
    }


    /*
    x = parsedString blah (blank 1);
    y = parsedInt blah (blank 2);
    z = same as x

    itemlist.add(new Items(x, y, z));

    Note: when doing .add in ArrayList, you automatically create a new ArrayList number.
    No need to worry about your input "overwriting" a pre-existing object of class Items.
     */

    /*
    ===
    PR LIST:
    ===
    1 - blah - 5 rolls

    PO LIST:

     */
}
