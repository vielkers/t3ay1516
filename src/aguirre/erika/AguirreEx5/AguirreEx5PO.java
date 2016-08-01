package aguirre.erika.AguirreEx5;

public class AguirreEx5PO {
    private int PONum;
    private AguirreEx5Comp seller;
    private String date;
    private AguirreEx5Item[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    public AguirreEx5PO() {
    }

    public AguirreEx5PO(int PONum, AguirreEx5Comp seller, String date, AguirreEx5Item[] items, float[] quantities, String[] unitOfMeasure) {
        this.PONum = PONum;
        this.seller = seller;
        this.date = date;
        this.items = items;
        this.quantities = quantities;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONum() {
        return PONum;
    }

    public void setPONum(int PONum) {
        this.PONum = PONum;
    }

    public AguirreEx5Item[] getItems() {
        return items;
    }

    public void setItems(AguirreEx5Item[] items) {
        this.items = items;
    }

    public float[] getQuantities() {
        return quantities;
    }

    public void setQuantities(float[] quantities) {
        this.quantities = quantities;
    }

    public String[] getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String[] unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public AguirreEx5Comp getSeller() {
        return seller;
    }

    public void setSeller(AguirreEx5Comp seller) {
        this.seller = seller;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTotalPOPrice() {
        float currentTotal = 0;
        for (int a = 0; a < items.length; a++) {
            currentTotal += items[a].getPrice() * quantities[a];
        }
        return currentTotal;
    }
}
