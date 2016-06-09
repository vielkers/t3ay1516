package aranguren.bernadette;

/**
 * Created by Bernadette on 6/2/2016.
 */

public class Item {


    private int item_id;
    private String item_description;
    private String item_type;
    private float price;


    public Item(int item_id, float price, String item_type, String item_description) {
        this.item_id = item_id;
        this.price = price;
        this.item_type = item_type;
        this.item_description = item_description;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }
//int itemid;
//String itemdescription;
//String itemtype;
//float price;

    //itemid = 1121704;
    //itemdescription = "description";
    //itemtype = "type";
    //price = 100;

}
