package betina.mendoza.Exercise6;

public class Ex6PurchaseOrder {
    private int poNum, quantity[];
    private Product[] shoes;
    private Company vendor;
    public static int count = 0;

    public Ex6PurchaseOrder(Product shoes[], int quantity[], Company vendor)
    {
        this.quantity = quantity;
                this.shoes = shoes;
                        this.vendor = vendor;

        count = count +1;
        this.poNum = count;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public int getPoNum() {
        return poNum;
    }

    public void setPoNum(int poNum) {
        this.poNum = poNum;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public void setShoes(Product[] shoes) {
        this.shoes = shoes;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Company getVendor() {
        return vendor;
    }

    public Product[] getShoes() {
        return shoes;
    }
}

