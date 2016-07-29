package arvin.ymson;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class Exercise3Old {

    private String name;
    private double price;

    public Exercise3Old(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(double price){
        this.price = price;
    }

    public static void main(String[] args){
        Exercise3Old ariel = new Exercise3Old("Ariel", 7.50);
        System.out.println("Name: " + ariel.getName());
        System.out.println("Price: " + ariel.getPrice());
    }
}
