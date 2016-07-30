package src.matthew.reyes.Exercise7;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Item {
    public int id;
    public String itemDescription;
    public String itemType;
    public float price;
    public String UOM;
    public float quantity;

    public static float getTotal (Item product){
        float TotalPrice = product.price * product.quantity;
        return TotalPrice;

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
