package joshua.juanson.FinalVersionsExercises.Exercise3;

public class Exercise3PurchaseOrder {
        private int purchaseNumber;
        private Exercise3Item item;
        private float numberOfUnits;
        private String unitOfMeasure;
        private float totalAmount;

        public Exercise3PurchaseOrder (int purchaseNumber, Exercise3Item item, float numberOfUnits, String unitOfMeasure)
        {
            this.purchaseNumber = purchaseNumber;
            this.item = item;
            this.numberOfUnits = numberOfUnits;
            this.unitOfMeasure = unitOfMeasure;
        }
    public int getPurchaseNumber()
    {
        return purchaseNumber;
    }
    public Exercise3Item item()
    {
        return item;
    }
    public float getNumberOfUnits()
    {
        return numberOfUnits;
    }
    public String getUnitOfMeasure()
    {
        return unitOfMeasure;
    }
    public float getTotalAmount() { return this.item.getPrice()*this.getNumberOfUnits();}
    public void setPurchaseNumber()
    {
        this.purchaseNumber = purchaseNumber;
    }
    public void setItem(Exercise3Item item)
    {
        this.item = item;
    }
    public void setNumberOfUnits(float numberOfUnits)
    {
        this.numberOfUnits = numberOfUnits;
    }
    public void setUnitOfMeasure (String unitOfMeasure)
    {
        this.unitOfMeasure = unitOfMeasure;
    }
    }
