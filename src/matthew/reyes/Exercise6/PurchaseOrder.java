package src.matthew.reyes.Exercise6;

import src.matthew.reyes.Exercise5.*;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class PurchaseOrder {
    public static int totalPO;
    public int PurchaseOrderNumber;
    public Company supplier;
    public String date;
    public Item[] products;

    public PurchaseOrder(int PurchaseOrderNumber, Company supplier, String date, Item[] products) {
        totalPO++;
        this.PurchaseOrderNumber = totalPO;
        this.supplier = supplier;
        this.date = date;
        this.products = products;

    }

    public float getPOtotal(PurchaseOrder PO) {
        float POtotal = 0;
        for (int n = 0; n < products.length; n++) {
            POtotal += Item.getTotal(products[n]);
        }

        return totalPO;
    }


    public boolean latestPO() {
        if (totalPO == this.PurchaseOrderNumber) {
            return true;
        }
            else{
                return false;
            }

    }
        public PurchaseOrder(){

        }
        public static void setTotalPO(int totalPO) {
            PurchaseOrder.totalPO = totalPO;
        }

        public int getPurchaseOrderNumber() {
            return PurchaseOrderNumber;
        }

        public void setPurchaseOrderNumber(int purchaseOrderNumber) {
            PurchaseOrderNumber = purchaseOrderNumber;
        }

        public Company getSupplier() {
            return supplier;
        }

        public void setSupplier(Company supplier) {
            this.supplier = supplier;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Item[] getProducts() {
            return products;
        }

        public void setProducts(Item[] products) {
            this.products = products;
        }
    }




