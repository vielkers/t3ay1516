package joshua.juanson.FinalVersionsExercises.Exercise7;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Exercise7PurchaseOrder {
    public static int purchaseOrderToDate;
    private int purchaseNumber;
    private String date;
    private Exercise7Company company;
    private Exercise7Item [] item;
    private float [] numberOfUnits;
    private String [] unitOfMeasure;
    ArrayList<Integer> number = new ArrayList<Integer>(3);
    {
        number.add(1);
        number.add(2);
        number.add(3);
    }
    ArrayList<Float> units = new ArrayList<Float>(3);

    {
        units.add(1f);
        units.add(2f);
        units.add(3f);
    }
    ArrayList<String> measure = new ArrayList<>(3);

    {
        measure.add("pieces");
        measure.add("units");
        measure.add("cans");
    }
    public Exercise7PurchaseOrder(int purchaseNumber, String date, Exercise7Item item [], Exercise7Company company)
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
    public Exercise7Item [] item()
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
    public void setItem(Exercise7Item [] item)
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
