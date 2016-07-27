package keith.lim.ex7;
import java.util.ArrayList;

public class PurchaseOrder {
  public static int POsToDate;
  private int PONumber;
  private Company vendor;
  private String date;
  private ArrayList<Item> items;
  private ArrayList<Float> quantities;
  private ArrayList<String> unitOfMeasure;

  public PurchaseOrder(Company vendor, String date, ArrayList<Item> items, ArrayList<Float> quantities, ArrayList<String> unitOfMeasure) {
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

  public ArrayList<Item> getItems() {
    return items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  public ArrayList<Float> getQuantities() {
    return quantities;
  }

  public void setQuantities(ArrayList<Float> quantities) {
    this.quantities = quantities;
  }

  public ArrayList<String> getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(ArrayList<String> unitOfMeasure) {
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

  public static double totPrice(ArrayList<Item> stuff, ArrayList<Float> quantities){
    double totPrice = 0;
    for (int n = 0; n<stuff.size(); n++){
      totPrice = stuff.get(n).getPrice()*quantities.get(n) + totPrice;
    }
    return totPrice;
  }

  public boolean isLatestPO() {
    if (POsToDate == this.PONumber ) {
      return true;
    } else return false;
  }

}
