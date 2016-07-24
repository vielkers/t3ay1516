package carvajal.vielka.Ex3;

/**
 * Created by IE on 6/17/2016.
 */
public class PurchaseOrder {

    private float quantity;
    private int purchaseOrderNumber;
    private String uOM;
    private Item item;

    public PurchaseOrder (float quantity, int purchaseOrderNumber, String uOM, Item item) {
        this.quantity = quantity;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.uOM = uOM;
        this.item = item;
    }

    public float getQuantity() { return quantity; }
    public void setQuantity(float quantity) { this.quantity = quantity; }
    public int getPurchaseOrderNumber() { return purchaseOrderNumber; }
    public void setPurchaseOrderNumber(int purchaseOrderNumber) { this.purchaseOrderNumber = purchaseOrderNumber; }
    public String getuOM() { return uOM; }
    public void setuOM(String uOM) { this.uOM = uOM; }
    public Item getItem() { return item; }
    public void setItem(Item item) {this.item = item; }

}