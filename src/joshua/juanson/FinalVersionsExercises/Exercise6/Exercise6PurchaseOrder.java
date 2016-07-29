package joshua.juanson.FinalVersionsExercises.Exercise6;
public class Exercise6PurchaseOrder {
    public static int purchaseOrderToDate;
    private int purchaseNumber;
    private String date;
    private float numberOfUnits;
    private String unitOfMeasure;
        public Exercise6PurchaseOrder(int purchaseNumber, String date, float numberOfUnits, String unitOfMeasure)
    {
        purchaseOrderToDate++;
        this.date = date;
        this.purchaseNumber=purchaseNumber;
        this.numberOfUnits = numberOfUnits;
        this.unitOfMeasure = unitOfMeasure;
    }
    //Different methods
    public int getPurchaseNumber()
    {
        return purchaseNumber;
    }
    public float getNumberOfUnits()
    {
        return numberOfUnits;
    }
    public String getUnitOfMeasure()
    {
        return unitOfMeasure;
    }
    public void setPurchaseNumber(int purchaseNumber)
    {
        this.purchaseNumber = purchaseNumber;
    }
    public void setNumberOfUnits(float numberOfUnits)
    {
        this.numberOfUnits = numberOfUnits;
    }
    public void setUnitOfMeasure (String unitOfMeasure)
    {
        this.unitOfMeasure = unitOfMeasure;
    }
    public String getDate(){
        return date;
    }
    public void setDate (String date){
        this.date = date;
    }

    //For POs up to date
    public boolean latestPurchaseOrder()
    {
        if(purchaseOrderToDate == purchaseNumber)
        {
        return true;
        }
        else
        return false;
    }
}
