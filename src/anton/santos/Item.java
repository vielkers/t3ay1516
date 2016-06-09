package anton.santos;

/**
 * Created by Anton on 6/7/2016.
 */
public class Item {

  private int itemID;
  private String itemDesc;
  private String itemType;
  private float price;

  public void setItemID(int itemID) {
    this.itemID = itemID;
  }

  public void setItemDesc(String itemDesc) {
    this.itemDesc = itemDesc;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Item{" +
        "itemID=" + itemID +
        ", itemDesc='" + itemDesc + '\'' +
        ", itemType='" + itemType + '\'' +
        ", price=" + price +
        '}';
  }

  public Item(int itemID, String itemDesc, String itemType, float price) {
    this.itemID = itemID;
    this.itemDesc = itemDesc;
    this.itemType = itemType;
    this.price = price;


  }

  public int getItemID() {
    return itemID;
  }

  public String getItemDesc() {
    return itemDesc;
  }

  public String getItemType() {
    return itemType;
  }

  public float getPrice() {
    return price;
  }

}
