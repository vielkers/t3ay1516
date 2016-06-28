package jason.lau.Ex3;

/**
 * Created by Jason on 6/7/2016.
 */
public class GetTotalPOAmount {

        public static void main(String[] args) {
            Items Dove = new Items(1, "Shampoo", "Personal Care", 240.01f);

            PurchaseOrder Here = new PurchaseOrder(1f, 7, "Cases", Dove);

            System.out.println("Location: " + Here.getCases());
            System.out.println("");

            System.out.println("Item ID: " + Dove.getItemid());
            System.out.println("Item Description: " + Dove.getItemdesc());
            System.out.println("Item Type: " + Dove.getItemty());
            System.out.println("Price: " + Dove.getPrice() + " Pesos");
            System.out.println("Unit of Measurement: " + Here.getUom());

            System.out.println("---------------------------------------------------");
            System.out.println("Purchase Order Number: " + Here.getPonum());
            System.out.println("Quantity Ordered: " + Here.getQuan());
            System.out.println("Total Purchase Order Price: " + Here.getTotalPOPrice() + " Pesos");


        }
    }
