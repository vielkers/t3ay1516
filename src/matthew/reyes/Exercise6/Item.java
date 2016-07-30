package matthew.reyes.Exercise6;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Item {
    private int id;
    private String itemDescription;
    private String itemType;
    private float price;
    private float quantity;

    public Item() {
        this.id = 1002;
        this.itemDescription = "Description";
        this.itemType = "Type";
        this.price = 750000.00f;
    }

    public Item(int id, String itemDescription, String itemType, float price) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;
        if (this.id == 1) {
            itemDescription = "Servers";
            itemType = "IT Hardware";
            price = 250000;
        }
        if (this.id == 2) {
            itemDescription = "Database";
            itemType = "IT Software";
            price = 150000;
        }
        if (this.id == 3) {
            itemDescription = "Website";
            itemType = "General Software";
            price = 100000;

        } else {
            System.out.println("Please enter a valid Item ID #: \n 1. Servers \n 2. Database \n 3. Website");
        }
    }
        public static float getTotal(Item Product) {
        float totalPrice = Product.price * Product.quantity;
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




