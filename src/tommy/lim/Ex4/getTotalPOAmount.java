package tommy.lim.Ex4;

/**
 * Created by IE on 6/25/2016.
 */
public class getTotalPOAmount {



    public static void main(String[] args){

        float sum =0;
        float total = 0;

        Item Apple = new Item(1, "Cellphone", "Gadgets", 12345.4f);
        Item Wire = new Item(2, "Charger", "Gadgets", 321.2f);
        Item Ballpen = new Item(3, "Writing Material", "Pen", 435.8f);

        float [] quantity = {701, 702, 703};
        String [] UOM1 = {"Pieces", "Pieces", "Pieces"};
        Item [] itemname = {Apple, Wire, Ballpen};
        PO okay = new PO(1, quantity, UOM1, itemname);


        for(int i =  0; i < 3; i++)
        {
            System.out.print(okay.quantity[i] + " " + okay.UOM[i] + " of ");
            System.out.println(okay.products[i].getItemdescription()+" = Php "+ okay.quantity[i]*okay.products[i].getPrice());
            sum = okay.quantity[i] * okay.products[i].getPrice();
            total = total + sum;


        }
        System.out.println("Total Purchase: " + total);

    }
}
