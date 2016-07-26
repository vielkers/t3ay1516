package anton.santos.Ex34567;
import java.util.Random;

/**
 * Created by Anton on 6/17/2016.
 */
public class TotalPurchase {
    //Dictionary

    public static void main(String[] args) {

        Random r = new Random(System.currentTimeMillis());
        int rand;
        rand = r.nextInt(3);

        float total = 0;
        float sum =0;


        //Dictionary add values
        ItemsPrice.ID.put(0,17.5f);
        ItemsPrice.ID.put(1,45f);
        ItemsPrice.ID.put(2,32.75f);
        ItemsPrice.ID.put(3,29.5f);



        //Items
        Item safeguard = new Item(0, "safeguard", "soap", 17.5f);
        Item kitkat = new Item(1, "kitkat", "chocolate", 45f);
        Item twinkies = new Item(2, "twinkies", "snack back", 32.75f);
        Item coke = new Item(3, "coke","soft drink", 29.5f);

        //PurchaseOrder
        int[] qarray = {3,5,7,4};
        String [] zarray = {"boxes", "bars","wraps" ,"bottles"};
        Item [] narray = {safeguard, kitkat, twinkies, coke};
        PurchaseOrder First = new PurchaseOrder(qarray,zarray,narray);
        PurchaseOrder Second = new PurchaseOrder(qarray,zarray,narray);
        //First.PONumber = 1001;

        int Total = 0;


        System.out.print("Purchase order # ");
        System.out.println(First.PONumber);
        System.out.println("Your purchases:");
        for(int i =0; i< 4;i++){


            //Quantity and Item Desc
            System.out.print(First.quantity[i]+" "+First.UOM[i]+" of ");
            System.out.print("(" + ItemsPrice.ID.keySet().toArray()[i]+")");
            //Price Calculation

            System.out.println(First.box[i].getItemDesc()+" = Php "+ First.quantity[i]*ItemsPrice.ID.get(i));
            //System.out.println(First.box[i].getItemDesc()+" = Php "+ First.quantity[i]*First.box[i].getPrice());


            sum = First.quantity[i]*ItemsPrice.ID.get(i);
        //sum = First.quantity[i]*First.box[i].getPrice();
            total = total + sum;


        }
        //Total Price Calculation
        System.out.print("Total Amount due is = Php ");
        System.out.println(total);

        if((First.PONumber) == PurchaseOrder.count -1 ) {

            System.out.print("This is the latest PO");
        } else System.out.print("This is not the latest PO");



    }
}
