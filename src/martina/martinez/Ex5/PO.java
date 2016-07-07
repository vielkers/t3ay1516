package martina.martinez.Ex5;

import java.util.HashMap;

public class PO {
    private int PONumber;
    private Vendor vendor;
    private String date;
    private martina.martinez.Ex5.Item[] items;
    private float[] quantities;
    private String[] unitOfMeasure;

    private HashMap<Integer, Float> hm = new HashMap<>();

    public PO() {
    }

    public PO(int PONumber, Vendor vendor, String date, martina.martinez.Ex5.Item[] items, float[] quantities, String[] unitOfMeasure) {
        this.PONumber = PONumber;
        this.vendor = vendor;
        this.date = date;
        this.items = items;
        this.quantities = quantities;
        this.unitOfMeasure = unitOfMeasure;
    }
    hm.put(nth,1001);
    System.out.println(hm.get.nth);
    public int getPONumber() {
        return PONumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public martina.martinez.Ex5.Item[] getItems() {
        return items;
    }

    public void setItems(martina.martinez.Ex5.Item[] items) {
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

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
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
                        //hm.get(items[i].getId())
        }
        return currentTotal;
    }



    }

