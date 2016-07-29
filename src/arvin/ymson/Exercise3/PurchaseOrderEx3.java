package arvin.ymson.Exercise3;

import arvin.ymson.Exercise4.Items;

/**
 * Created by arvin_000 on 7/26/2016.
 */
public class PurchaseOrderEx3 {

    private int poNumber,quantity;
    private Items myPets;

    public PurchaseOrderEx3(Items myPets, int quantity, int poNumber){
        this.poNumber = poNumber;
        this.quantity = quantity;
        this.myPets = myPets;
    }

    public int getQuantity () {
    return quantity;
    }

    public int getPoNumber() {
        return poNumber;
    }
    public Items getPets() {
        return myPets;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPONumber(int poNumber) {
        this.poNumber = poNumber;
    }
    public void setPets(Items myPets) {
        this.myPets = myPets;
    }


}
