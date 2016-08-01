package betina.mendoza.Exercise7;

import java.util.ArrayList;

public class Exercise7 {

    private int poNum;
    private ArrayList <Integer> quantity;
    private ArrayList <Product>shoes;
    private Company vendor;
    public static int count = 0;

    public Exercise7(ArrayList<Product> shoes, ArrayList<Integer> quantity, Company vendor){
        this.quantity = quantity;
        this.shoes = shoes;
        this.vendor = vendor;

        count = count +1;
        this.poNum = count;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }

    public void setPoNum(int poNum) {
        this.poNum = poNum;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public int getPoNum() {
        return poNum;
    }

    public ArrayList<Product> getShoes() {
        return shoes;
    }

    public Company getVendor() {
        return vendor;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Exercise7.count = count;
    }

    public void setShoes(ArrayList<Product> shoes) {
        this.shoes = shoes;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }
}
