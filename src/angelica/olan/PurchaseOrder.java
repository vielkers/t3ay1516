package angelica.olan;

/**
 * Created by IE on 6/17/2016.
 */
public class PurchaseOrder {
    package angelica.olan;

    /**
     * Created by Angel on 6/2/2016.
     */
    //public class PurchaseOrder {
        //String item:
        //float quantity:
        //float price:
        //float total:

        int[] itemName[];


        public PurchaseOrder(float price) {
            this.price = price;
        }

        public float getTotal() {
            return total = quantity*price;
        }

        public void setTotal(float total) {
            this.total = total;
        }

        public float getPrice() {
            return price;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getItem() {
            return item;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public float getQuantity() {
            return quantity;
        }

        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }
    }
}
