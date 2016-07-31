package anton.santos.LimSantosTP;

import java.util.ArrayList;

/**
 * Created by Anton on 7/28/2016.
 */
public class Testing {

    public static void main(String[] args){

        //TESTING: Printing out item contents in PR.
        ArrayList<Items> itemlist = new ArrayList<Items>();
        //itemlist.add(new Items("Book", 2, "shelf", 50));
        //itemlist.add(new Items("Poop", 1, "Bucket", 120));

        PR sample = new PR(itemlist, "Nerds at the Library"  );

        //System.out.println(PR.listItems(itemlist));

        //clear line for next test.
        System.out.println("\n============");

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

