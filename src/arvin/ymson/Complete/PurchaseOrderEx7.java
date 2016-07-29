package arvin.ymson.Complete;

import arvin.ymson.Exercise4.Items;
import arvin.ymson.Exercise5.CompanyEx5;

import java.util.ArrayList;

/**
 * Created by arvin_000 on 7/28/2016.
 */
public class PurchaseOrderEx7 {

    private int poNumber;
    private ArrayList <Integer> quantity;
    private ArrayList<Items>myPets;
    private CompanyEx5 vendor;
    public static int count = 0;

    public PurchaseOrderEx7(ArrayList <Items> myPets, ArrayList<Integer> quantity, CompanyEx5 vendor){
        this.quantity = quantity;
        this.myPets = myPets;
        this.vendor = vendor;

        count = count +1;
        this.poNumber = count;
    }

    public ArrayList<Integer> getQuantity () {
        return quantity;
    }
    public CompanyEx5 getVendor(){
        return vendor;
    }

    public int getPoNumber() {
        return poNumber;
    }
    public ArrayList<Items> getPets() {
        return myPets;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }
    public void setPONumber(int poNumber) {
        this.poNumber = poNumber;
    }
    public void setPets(ArrayList<Items> myPets) {
        this.myPets = myPets;
    }
    public void setVendor (CompanyEx5 vendor) {
        this.vendor = vendor;
    }

}
