package martina.martinez.Ex3;

import java.util.ArrayList;

public class PurchaseOrder {
	int poNumber;
	ArrayList<String> Items = new ArrayList<String>();
	int quantity;
	String UOM;
	
	public PurchaseOrder(int poNumber, ArrayList<String> Items, int quantity, String UOM){
		this.poNumber=poNumber;
		this.Items=Items;
		this.quantity=quantity;
		this.UOM=UOM;
	}

	public int getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}

	public ArrayList<String> getItems() {
		return Items;
	}

	public void setItems(ArrayList<String> items) {
		Items = items;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}
	
}
