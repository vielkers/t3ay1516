package arvin.ymson.Exercise4;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class PurchaseOrderEx4 {

    private int poNumber,quantity[];
    private Items[] myPets;



    public PurchaseOrderEx4(Items myPets[], int quantity[], int poNumber){
        this.poNumber = poNumber;
        this.quantity = quantity;
        this.myPets = myPets;
    }

    public int [] getQuantity () {
        return quantity;
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


}
