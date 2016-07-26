package aguirre.erika.AguirreEx4;

/**
 * Created by IE on 7/22/2016.
 */
public class AguirreEx4PO {
    private int PONum;
    private AguirreEx4Item[] products;
    private float[] amount;
    private String[] unitOfMeasure;

    public AguirreEx4PO() {
    }

    public AguirreEx4PO(int PONumber, AguirreEx4Item[] products, float[] amount, String[] unitOfMeasure) {
        this.PONum = PONum;
        this.products = products;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONumber() {
        return PONum;
    }

    public void setPONumber(int PONumber) {
        this.PONum = PONum;
    }

    public AguirreEx4Item[] getItems() {
        return products;
    }

    public void setProducts(AguirreEx4Item[] products) {
        this.products = products;
    }

    public float[] getAmount() {
        return amount;
    }

    public void setAmount(float[] amount) {
        this.amount = amount;
    }

    public String[] getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String[] unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public float getTotalPOPrice() {
        float currentTotal = 0;
        for (int i = 0; i < products.length; i++) {
            currentTotal += products[i].getPrice() * amount[i];
        }
        return currentTotal;
    }

}

