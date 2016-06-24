package instructor.solutions.ex4;

public class PurchaseOrder {
  private int PONumber;
  private Item[] items;
  private float[] quantities;
  private String[] unitOfMeasure;

  public PurchaseOrder() {
  }

  public PurchaseOrder(int PONumber, Item[] items, float[] quantities, String[] unitOfMeasure) {
    this.PONumber = PONumber;
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

  public float getTotalPOPrice() {
    float currentTotal = 0;
    for (int i = 0; i < items.length; i++) {
      currentTotal += items[i].getPrice() * quantities[i];
    }
    return currentTotal;
  }

}
