package arvin.ymson.Exercise4;

/**
 * Created by arvin_000 on 6/28/2016.
 */
public class Items {

    private String name;
    private double price;

    public Items(String myName, double myPrice){
        this.name = myName;
        this.price = myPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public  double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}

