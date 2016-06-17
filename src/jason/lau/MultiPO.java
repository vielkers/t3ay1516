package jason.lau;

/**
 * Created by Jason on 6/10/2016.
 */
public class MultiPO {
    public static void main(String[] args) {
        Items Dove = new Items(1, "Shampoo", "Personal Care", 240.01f);
        Items LiptonTea = new Items(2, "Bottles", "Drinks", 46.89f);
        Items Surf = new Items(3, "Pack", "Home Care", 9.00f);
        Items Rexona = new Items(4, "Bottles", "Personal Care", 65.45f);

        int [] sarray = {4,5,8,9};
        String [] larray = {"Shampoo", "Bottles", "Home Care", "Personal Care"};
        Items [] harray = {Dove, LiptonTea, Surf, Rexona};
        PurchaseOrder Here = new PurchaseOrder(1, sarray, larray,harray);

        System.out.println("Purchase Order # ");
        System.out.println(Here.getPonum());
        System.out.println("Items: ");

        for(int i = 0; i < 4; i++) {

            System.out.println(Here.quan[i] + " ");
            System.out.println(Here.uom[i] + " ");
            System.out.println(Here.box[i].getitemdesc + Here.quan[i] * Here.box[i].getPrice());
        }



    }
}
