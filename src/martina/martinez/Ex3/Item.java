package martina.martinez.Ex3;

public class Item {
	int itemID;
	String itemDesc;
	String itemType;
	float price;
	
	public Item (int itemID, String itemDesc, String itemType, float price){
		this.itemID=itemID;
		this.itemDesc=itemDesc;
		this.itemType=itemType;
		this.price=price;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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
