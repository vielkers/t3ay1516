package anton.santos.PurchaseOrder;

/**
 * Created by Anton on 6/17/2016.
 */
public class TotalPurchase {
    public static void main(String[] args) {
        //Items
        Item safeguard = new Item(1, "safeguard", "soap", 17.5f);
        Item kitkat = new Item(2, "kitkat", "chocolate", 45f);
        Item twinkies = new Item(3, "twinkies", "snack back", 32.75f);
        Item coke = new Item(4, "coke","soft drink", 29.5f);

        //PurchaseOrder
        int[] qarray = {3,5,7};
        String [] zarray = {"boxes", "bars", "bottles"};
        Item [] narray = {safeguard, kitkat, coke, twinkies};
        PurchaseOrder First = new PurchaseOrder(1001, qarray,zarray,narray);
        First.PONumber = 1001;
        int Total = 0;
        System.out.print("Purchase order # ");
        System.out.println(First.PONumber);
        System.out.println("Your purchases:");
        for(int i =0; i< 3;i++){


            //Quantity and Item Desc
            System.out.print(First.quantity[i]+" "+First.UOM[i]+" of ");
            //Price Calculation
            System.out.println(First.box[i].getItemDesc()+" = Php "+ First.quantity[i]*First.box[i].getPrice());


        }
        //Total Price Calculation
        System.out.print("Total Amount due is = Php ");
        System.out.println(First.quantity[0]*First.box[0].getPrice()+First.quantity[1]*First.box[1].getPrice()+First.quantity[2]*First.box[2].getPrice());



    }
}
