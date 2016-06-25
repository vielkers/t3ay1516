//package keith.lim;


//Try to make a total PO receipt.
public class TotalPurchase {

    public static void main(String[] args) {

        keith.lim.Item basket[] = new keith.lim.Item[]{new keith.lim.Item(1, "Chihuahua", "Dog", 5000, 5, "Crates")
                , new keith.lim.Item(2, "Shark", "Fish", 10000, 3, "Aquariums")
                , new keith.lim.Item(3, "Gerbil", "Expensive Rodent", 50000, 10, "Packs")};

        for (int z = 0; z < 3; z++) {

            float totprice = 0;
            totprice = basket[z].getQty() * basket[z].getPrice();
            System.out.println(totprice);


        }
    }

}
