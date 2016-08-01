package betina.mendoza.Exercise4;

public class Ex4PO {

    private int poNum, quantity[];
    private Product[] shoes;

    public Ex4PO (Product shoes[], int quantity[], int poNum){
    this.poNum = poNum;
        this.quantity = quantity;
            this.shoes = shoes;

    }

    public int getPoNum() {
        return poNum;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public Product[] getShoes() {
        return shoes;
    }

    public void setPoNum(int poNum) {
        this.poNum = poNum;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public void setShoes(Product[] shoes) {
        this.shoes = shoes;
    }
}
