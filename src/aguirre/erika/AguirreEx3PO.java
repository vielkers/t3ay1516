package aguirre.erika;

/**
 * Created by IE on 7/22/2016.
 */
public class AguirreEx3PO {
    private int PONum;
    private AguirreEx3Item product;
    private float amount;
    private String unitOfMeasure;

    public AguirreEx3PO(int PONumber, AguirreEx3Item product, float amount, String unitOfMeasure) {
        this.PONum = PONum;
        this.product = product;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONum() {
        return PONum;
    }

    public void setPONum(int PONum) {
        this.PONum = PONum;
    }

    public AguirreEx3Item getItem() {
        return product;
    }

    public void setItem(AguirreEx3Item item) {
        this.product = item;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public float getTotalPOPrice() {
        return this.product.getPrice() * this.amount;
    }
}

