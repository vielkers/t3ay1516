package joshua.juanson.FinalVersionsExercises.Exercise5;
public class Exercise5PurchaseOrder
{
        private int purchaseNumber;
        private String date;
        private Exercise5Item [] item;
        private Exercise5Company company;
        private float [] numberOfUnits;
        private String [] unitOfMeasure;
        public Exercise5PurchaseOrder(int purchaseNumber, String date, Exercise5Item item [], Exercise5Company company, float numberOfUnits [], String unitOfMeasure [])
        {
            this.purchaseNumber = purchaseNumber;
            this.item = item;
            this.company = company;
            this.date = date;
            this.numberOfUnits = numberOfUnits;
            this.unitOfMeasure = unitOfMeasure;
        }
    //Different methods
    public int getPurchaseNumber()
    {
        return purchaseNumber;
    }
    public Exercise5Item [] item()
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
    public void setItem(Exercise5Item [] item)
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
    public String getDate(){
        return date;
    }
    public void setDate (String date){
        this.date = date;
    }
    public float getTotalAmount() {
        float currentTotalAmount = 0;
        for (int current = 0; current < item.length; current++)
        {
            currentTotalAmount += item[current].getPrice()*numberOfUnits[current];
        }
        return currentTotalAmount;
    }
    }
