public class PurchaseOrder {

    int poNumber;
    static int counter = 0;

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public PurchaseOrder() {
        counter = counter + 1;
        this.poNumber = counter;
    }

    public static boolean isLatestPO(int z){
        if (z == counter){
            return true;
        } else return false;
    }
}