// TODO: Fix errors

/*
package betina.mendoza.Exercise6;

import betina.mendoza.Exercise5.Company;
import betina.mendoza.Exercise3.Item;

import java.util.ArrayList;

public class Ex6PurchaseOrder {
    private int poNum;
    private Item item;
    private int qty;
    private String uom;
    private Company vendor;
    private static int counter;
    private ArrayList<betina.mendoza.Exercise3.PurchaseOrder> purchaseOrderList = new ArrayList<betina.mendoza.Exercise3.PurchaseOrder>();

    public int getPoNum() {
        return poNum;
    }

    public void setPoNum(int poNum) {
        this.poNum = poNum;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Company getVendor() {
        return vendor;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public Ex6PurchaseOrder(Item item, int qty, String uom, Company vendor) {
        this.item = item;
        this.qty = qty;
        this.uom = uom;
        this.vendor = vendor;
    }

    public int countTotalPurchaseOrder() {
        counter = purchaseOrderList.size() + 1;
        return counter;
    }

    public boolean isLatest(betina.mendoza.Exercise3.PurchaseOrder purchaseOrder) {
        if (purchaseOrder.getPoNum() > purchaseOrderList.get(purchaseOrderList.size() - 1).getPoNum()) {
            return true;
        } else {
            return false;
        }
    }

    public void addPurchaseOrder(betina.mendoza.Exercise3.PurchaseOrder purchaseOrder) {
        purchaseOrder.setPoNum(purchaseOrderList.get(purchaseOrderList.size() - 1) + 1);
        purchaseOrderList.add(purchaseOrder);
    }
}
*/
