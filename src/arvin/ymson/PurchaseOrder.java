package arvin.ymson;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class PurchaseOrder {

        private String name;
        private String unit;
        private int quantity;
        private double price;

        public PurchaseOrder(){

        }

        public PurchaseOrder(String name, String unit, int quantity, double price) {
            this.name = name;
            this.unit = unit;
            this.quantity = quantity;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public static void main(String[]args){
            PurchaseOrder po = new PurchaseOrder();
            PurchaseOrder purchasedItems[] = new PurchaseOrder[5];

            purchasedItems[0] = new PurchaseOrder("Ariel", "pcs", 6, 7.50);
            purchasedItems[1] = new PurchaseOrder("Tide", "pcs", 1, 25);
            purchasedItems[2] = new PurchaseOrder("Surf", "pcs", 6, 10);
            purchasedItems[3] = new PurchaseOrder("Bonux", "pcs", 10, 12.75);
            purchasedItems[4] = new PurchaseOrder("Breeze", "pcs", 24, 9.50);

            System.out.println("Name  Unit  Qty  Price");
            for(int x = 0;x < purchasedItems.length;x++){
                PurchaseOrder i = purchasedItems[x];

                System.out.println(i.getName() + " - " + i.getUnit() + " - " + i.getQuantity() + " - " + i.getPrice());
            }
            System.out.println("----------------------------------");
            System.out.println("Total                 " + po.getPurchaseOrderTotalAmount(purchasedItems));
        }

        /**
         * Computes the total amount of ordered items.
         * @param items - The items ordered
         * @return - Returns the total amount.
         */
        private double getPurchaseOrderTotalAmount(PurchaseOrder items[]){
            double totalAmount = 0;

            for(int x = 0;x < items.length;x++){
                PurchaseOrder i = items[x];

                double subtotal = i.getPrice() * i.getQuantity();
                totalAmount += subtotal; //totalAmount = totalAmount + subtotal
            }

            return totalAmount;
        }

    }
