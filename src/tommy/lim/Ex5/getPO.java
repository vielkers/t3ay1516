package tommy.lim.Ex5;

/**
 * Created by IE on 6/28/2016.
 */
public class getPO {
    public static void main(String[] args) {

        float sum = 0;
        float total = 0;

        Item5 Apple = new Item5(1, "Cellphone", "Gadgets", 12345.4f);
        Item5 Wire = new Item5(2, "Charger", "Gadgets", 321.2f);
        Item5 Ballpen = new Item5(3, "Writing Material", "Pen", 435.8f);

        float[] quantity = {701, 702, 703};
        String[] UOM1 = {"Pieces", "Pieces", "Pieces"};
        Item5[] itemname = {Apple, Wire, Ballpen};
        PO5 okay = new PO5(1, quantity, UOM1, itemname);


        for (int i = 0; i < 3; i++) {
            System.out.print(okay.quantity1[i] + " " + okay.UOM[i] + " of ");
            System.out.println(okay.products[i].getItemdescription() + " = Php " + okay.quantity1[i] * okay.products[i].getPrice());
            sum = okay.quantity1[i] * okay.products[i].getPrice();
            total = total + sum;


        }
        System.out.println("Total Purchase: " + total);

        if ((okay.ponumber) == PO5.count - 1) {
            System.out.print("It is the latest purchase order!");
        } else
            System.out.print("It is not the latest purchase order!");

    }
}