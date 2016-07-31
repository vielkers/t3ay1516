package anton.santos.LimSantosTP;

import java.util.ArrayList;

/**
 * Created by Anton on 7/28/2016.
 */
public class Utilities {

    /*
        UTILITIES FOR GETTING PRICES
     */

    //Gets the total price of ONE item.
    public static double onePrice(Items stuff){

        double totPrice = stuff.qty*stuff.price;
        return totPrice;
    }

    //Function that double checks if you really want to make a PO, given that onti nalang pera mo.
    public static void gateWay(ArrayList<Items> items, String requesting, Supplier supplier){
        /*PROMPT:
        IF your money is below 100,000:

        ===
        You only have ___ funds left. Are you sure you want to make your PO?

        1 - Yes
        2 - No
        ===

        Let's say the prompt = n.

         */
        //MAKE n A PARSED INPUT. THIS IS EQUAL TO 1 FOR SAKE OF SAMPLE.
        int n = 1;
        if (n==1){
            //make a new PO
        }
        if (n==0){
            //close window
        }
        else {
            //print: "Please only type "1" or "0"
        }

    }

}
