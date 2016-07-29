package joshua.juanson.FinalVersionsExercises.Exercise4;

public class Exercise4PurchaseOrder{
        private int purchaseNumber;
        private Exercise4Item [] item;
        private float [] numberOfUnits = new float [] {1,2,3};
        private String [] unitOfMeasure = new String [] {"pcs.","pcs.","pcs."};
        private float totalAmount;

        public Exercise4PurchaseOrder(int purchaseNumber, Exercise4Item item [], float numberOfUnits [], String unitOfMeasure [])
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
    public Exercise4Item [] item()
    {
        return item;
    }
    public float [] getNumberOfUnits()
    {
        return numberOfUnits;
    }
    public String [] getUnitOfMeasure()
    {
        return unitOfMeasure;
    }
    public void setPurchaseNumber(int purchaseNumber)
    {
        this.purchaseNumber = purchaseNumber;
    }
    public void setItem(Exercise4Item [] item)
    {
        this.item = item;
    }
    public void setNumberOfUnits(float [] numberOfUnits)
    {
        this.numberOfUnits = numberOfUnits;
    }
    public void setUnitOfMeasure (String [] unitOfMeasure)
    {
        this.unitOfMeasure = unitOfMeasure;
    }
    private float getTotalAmount()
    {
        float currentTotalAmount = 0;
        for (int current = 0; current < item.length; current++)
        {
            currentTotalAmount += item[current].getPrice()*numberOfUnits[current];
        }
        return currentTotalAmount;
    }
    }
