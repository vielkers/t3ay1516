package aguirre.erika.AguirreEx6;

public class AguirreEx6PO {
    public static int POsToDate;
    private int PONumber;
    private AguirreEx6Comp seller;
    private String date;
    private AguirreEx6Item[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    public AguirreEx6PO(AguirreEx6Comp seller, String date, AguirreEx6Item[] items, float[] quantities, String[] unitOfMeasure) {
        POsToDate++;
        this.PONumber = POsToDate;
        this.seller = seller;
        this.date = date;
        this.items = items;
        this.quantities = quantities;
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public AguirreEx6Item[] getItems() {
        return items;
    }

    public void setItems(AguirreEx6Item[] items) {
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

    public AguirreEx6Comp getSeller() {
        return seller;
    }

    public void setSeller(AguirreEx6Comp seller) {
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

    public boolean isLatestPO() {
        if (POsToDate == this.PONumber ) {
            return true;
        } else return false;
    }
}