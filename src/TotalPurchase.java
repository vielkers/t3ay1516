//Try to make a total PO receipt.
public class TotalPurchase {

    public static void main(String[] args) {

        //Input into item basket.
      Item basket[] = new Item[]{new Item(1, "Chihuahua", "Dog", 5000, 5, "Crates")
                , new Item(2, "Shark", "Fish", 10000, 3, "Aquariums")
                , new Item(3, "Gerbil", "Expensive Rodent", 50000, 10, "Packs")};

        //Lists prices.
        for (int z = 0; z < 3; z++) {
            float totprice = 0;
            totprice = basket[z].getQty() * basket[z].getPrice();
            System.out.println(totprice);
        }

        PurchaseOrder po1 = new PurchaseOrder();

        PurchaseOrder po2 = new PurchaseOrder();


    }

}
