// TODO: Fix errors

/*package keith.lim.TermProject;

import java.util.ArrayList;

*//**
 * Created by kiiiiibble on 7/22/2016.
 *//*

*//* PURCHASE REQUISITION
A PR is a form sent from someone inside the company to the purchasing department.
Basically, it says "someone inside the company wants to order these things."
The purchaser then looks for suppliers and gets quotes that fulfill the needs
of the internal person.
*//*
public class PR {

    //to do: set items class. Adjust it here.

    ArrayList<Items> items;
    //What does the person want to buy?

    //How many units do they want to buy?
    int qty;
    //What units do they want?
    String UOM;
    //These next 2 are for setting the PR number, which is auto generated.
    static int prNumCount;
    int prNum;
    //The person/department requesting for the thing.
    String requesting;

    //Make a new PR. Note that the pr# is automated.
    public PR(String item, int qty, String UOM, String requesting) {
        prNumCount++;
        this.prNum = prNumCount;
        this.item = item;
        this.qty = qty;
        this.UOM = UOM;
        this.requesting = requesting;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public String getRequesting() {
        return requesting;
    }

    public void setRequesting(String requesting) {
        this.requesting = requesting;
    }
}*/
