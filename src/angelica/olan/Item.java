package angelica.olan;


public class Item {
    private int idnum;
    private float price;
    private String itemDescription;

    public Item() {
        this.idnum = 9999;
        this.itemDescription = "name";
        this.price = 100;
    }

    public Item(int id, String itemDescription, float price) {
        this.idnum = id;
        this.itemDescription = itemDescription;
        this.price = price;
    }

    public int getId() {
        return idnum;
    }

    public void setId(int id) {
        this.idnum = id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = 0;
    }
}


