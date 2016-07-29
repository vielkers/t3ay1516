


package tommy.lim.Ex6;
import tommy.lim.Ex5.Item5;


/**
 * Created by IE on 7/26/2016.
 */

public class getPO1 {
    public static void main(String[] args) {
        float sum;
        float total = 0;

        Item5 Apple = new Item5(1, "Cellphone", "Gadgets", 12345.4f);
        Item5 Wire = new Item5(2, "Charger", "Gadgets", 321.2f);
        Item5 Ballpen = new Item5(3, "Writing Material", "Pen", 435.8f);

        Company goods = new Company();
        float[] quantity = {701, 702, 703};
        String[] UOM1 = {"Pieces", "Pieces", "Pieces"};
        Item5[] itemname = {Apple, Wire, Ballpen};

        PO6 okay = new PO6(1, quantity, UOM1, itemname);
        System.out.println("PO Number: " + okay.getPonumber());
        System.out.println("Company Name: " + goods.getName());
        System.out.println("Location: " + goods.getAddress());
        System.out.println("Phone Number: " + goods.getPhone());
        System.out.println("Items:");


        for (int i = 0; i < 3; i++) {
            System.out.print(okay.quantity1[i] + " " + okay.UOM[i] + " of ");
            System.out.println(okay.products[i].getItemdescription() + " = Php " + okay.quantity1[i] * okay.products[i].getPrice());
            sum = okay.quantity1[i] * okay.products[i].getPrice();
            total = total + sum;


        }
        System.out.println("Total Purchase: " + total);





    }
}

