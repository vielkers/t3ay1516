package tommy.lim.Ex3;

/**
 * Created by IE on 6/7/2016.
 */
public class getTotalPOAmount {

    public static void main(String[] args){
        Item cp = new Item(1, "cellphone", 12345.6f, "gadget", "pieces");

        PO cp1 = new PO(32131241, 412f);

        System.out.println("Item ID: " + cp.getItemid());
        System.out.println("Item Desccription: " + cp.getItemdescription());
        System.out.println("Item Type: " + cp.getItemtype());
        System.out.println("Price: " + cp.getPrice());
        System.out.println("UOM: " + cp.getUOM());

        System.out.println("PO Number: " + cp1.getPonumber());
        System.out.println("Quantity: " + cp1.getQuantity());


    }
}
