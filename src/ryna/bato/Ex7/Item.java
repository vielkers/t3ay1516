package ryna.bato.Ex7;

public class Item {
    public int id;
    public String itemDescription;
    public String itemType;
    public float price;
    public String uom;
    public float quantity;
    /*
    public Item() {
        this.id = 9999;
        this.itemDescription = "item";
        this.itemType = "item";
        this.price = 100.00f;
    }
    */

    /*
    public Item( int id, String itemDescription, String itemType, float price){
        this.id = id;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;

        if (this.id == 1) {
            itemDescription = "Cologne 1";
            itemType = "High End";
            price = 1000;
            uom = "100 mL bottles";
        }

        if (this.id == 2) {
            itemDescription = "Cologne 2";
            itemType = "Ordinary Scent";
            price = 500;
            uom = "500 mL bottles";
        }

        if (this.id == 3) {
            itemDescription = "Cologne 3";
            itemType = "Affordable";
            price = 100;
            uom = "500 mL sprays";
        } else {
            System.out.println("Your ID is not in the system");
        }
    }
    */

    public static float getTotal(Item product) {
        float totalPrice = product.price * product.quantity;
        return totalPrice;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}