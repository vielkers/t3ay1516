package macavinta.gianninah.ex3;

/**
 * Created by IE on 6/25/2016.
 */
public class total {
    int quantity;
    float price;

    public total(int quantity, float price){
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
    public float gettotal(){
        return quantity*price;
    }
}