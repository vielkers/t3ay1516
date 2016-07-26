package keith.lim.Project;
//DONE

/**
 * Created by kiiiiibble on 7/22/2016.
 */

/* This represents the relevant items of the balance sheet of the company for purchasing.
Only cash, a/r, and a/p are listed. Functions are for manipulating these when arranging payments with
suppliers, so only cash and a/p have functions.
*/
public class Finances {

    static double cash = 500000;
    static double ar = 20000;
    static double ap = 20000;

    //For paying cash direct without A/P.
    public static void directCash(double cash) {
        Finances.cash = Finances.cash - cash;
    }

    //When buying new order. This'll add to your accounts payable.
    public static void plusAp(double ap) {
        Finances.ap = Finances.ap + ap;
    }

    //When paying off your accounts payable. Your cash gets subtracted as well as your ap.
    public static void payAp(double ap) {
        Finances.ap = Finances.ap - ap;
        Finances.cash = Finances.cash - ap;
    }

    public static double getCash() {
        return cash;
    }

    public static double getAr() {
        return ar;
    }

    public static double getAp() {
        return ap;
    }


}
