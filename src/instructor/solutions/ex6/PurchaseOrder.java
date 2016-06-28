package instructor.solutions.ex6;

public class PurchaseOrder {
  public static int POsToDate;
  private int PONumber;
  private Company vendor;
  private String date;
  private Item[] items;
  private float[] quantities;
  private String[] unitOfMeasure;

  public PurchaseOrder(Company vendor, String date, Item[] items, float[] quantities, String[] unitOfMeasure) {
    POsToDate++;
    this.PONumber = POsToDate;
    this.vendor = vendor;
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

  public Item[] getItems() {
    return items;
  }

  public void setItems(Item[] items) {
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

  public Company getVendor() {
    return vendor;
  }

  public void setVendor(Company vendor) {
    this.vendor = vendor;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public float getTotalPOPrice() {
    float currentTotal = 0;
    for (int i = 0; i < items.length; i++) {
      currentTotal += items[i].getPrice() * quantities[i];
    }
    return currentTotal;
  }

  public boolean isLatestPO() {
    if (POsToDate == this.PONumber ) {
      return true;
    } else return false;
  }

}
