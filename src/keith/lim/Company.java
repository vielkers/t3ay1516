package keith.lim;

import keith.lim.Item;

public class Company {

    public static void main(String[] args) {

        //Declare variables.
        String itemName;
        double price[] = new double[3];
        double totprice = 0;
        double discount = 0.95; //5% discount
        double discPrice;
        double vat = 1.12; //12% vat
        double vatInc;
        String compName = "Animal Buyers Inc.";

        //Lists items in the basket.
        Item basket[] = new Item[]{new Item(1, "Chihuahua", "Dog", 5000, 5, "Crates")
                , new Item(2, "Shark", "Fish", 10000, 3, "Aquariums")
                , new Item(3, "Gerbil", "Expensive Rodent", 50000, 10, "Packs")};

        //Writes company name.
        System.out.println("Purchaser: " + compName + "\n");

        //Lists the breakdown of items purchased and costs.
        for (int z = 0; z < 3; z++) {

            itemName = basket[z].itemDesc;
            price[z] = basket[z].getQty() * basket[z].getPrice();
            totprice = price[z] + totprice;

            System.out.println(itemName + " costs " + price[z] + " pesos");

        }

        //List total price, discount, then vat.
        discPrice = totprice*discount;
        vatInc = discPrice*vat;
        System.out.println("\nTOTAL PRICE: " + totprice);
        System.out.println("DISCOUNTED PRICE: " + discPrice);
        System.out.println("VAT: " + ((vat-1)*100) + "%" );
        System.out.println("BALANCE REMAINING: " + vatInc);

        System.out.print("\nThank you for purchasing from Animal Sellers Inc. \nPlease settle your balance within 3 weeks.");
    }
}
