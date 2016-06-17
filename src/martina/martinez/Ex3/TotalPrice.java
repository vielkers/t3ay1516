package martina.martinez.Ex3;

public class TotalPrice {
	int quantity;
	float price;
	
	public TotalPrice(int quantity, float price){
		this.quantity=quantity;
		this.price=price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotalPrice(){
		return quantity*price;
	}
}
