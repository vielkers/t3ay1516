package aranguren.bernadette.Ex7;

import java.util.ArrayList;

public class PurchaseOrder {
    public int poNumber = 923;
    private ArrayList<Item> item;
    private ArrayList<Integer> quantity;
    private ArrayList<String> uom;

    public PurchaseOrder (){};

    public PurchaseOrder(int poNumber, ArrayList<Item> item, ArrayList<Integer> quantity, ArrayList<String> uom) {
        this.poNumber = poNumber;
        this.item = item;
        this.quantity = quantity;
        this.uom = uom;
    }

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }

    public ArrayList<String> getUom() {
        return uom;
    }

    public void setUom(ArrayList<String> uom) {
        this.uom = uom;
    }
}

