package aguirre.erika.AguirreEx6;

public class AguirreEx6Item {
    private int id;
    private String itemName;
    private String itemCategory;
    private float price;

    public AguirreEx6Item() {
        this.id = 9999;
        this.itemName = "item";
        this.itemCategory = "item";
        this.price = 100.00f;
    }

    public AguirreEx6Item(int id, String itemName, String itemCategory, float price) {
        this.id = id;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
