package arvin.ymson.Exercise6;

import arvin.ymson.Exercise4.Items;
import arvin.ymson.Exercise5.CompanyEx5;

/**
 * Created by arvin_000 on 7/28/2016.
 */
public class PurchaseOrderEx6 {
    private int poNumber,quantity[];
    private Items[] myPets;
    private CompanyEx5 vendor;
    public static int count = 0;

    public PurchaseOrderEx6(Items myPets[], int quantity[], CompanyEx5 vendor){
        this.quantity = quantity;
        this.myPets = myPets;
        this.vendor = vendor;

        count = count +1;
        this.poNumber = count;
    }

    public int [] getQuantity () {
        return quantity;
    }
    public CompanyEx5 getVendor(){
        return vendor;
    }

    public int getPoNumber() {
        return poNumber;
    }
    public Items[] getPets() {
        return myPets;
    }

    public void setQuantity(int [] quantity) {
        this.quantity = quantity;
    }
    public void setPONumber(int poNumber) {
        this.poNumber = poNumber;
    }
    public void setPets(Items [] myPets) {
        this.myPets = myPets;
    }
    public void setVendor (CompanyEx5 vendor) {
        this.vendor = vendor;
    }
}
