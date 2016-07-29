package angelica.olan;

public class PurchaseOrder {
       private String itemDescription;
       private float qty;
       private float price;
       private float total;

     int[] itemName[];


       public PurchaseOrder(float price) {
            this.price = price;
        }

        public float getTotal() {
          return total = qty*price;
        }

        public void setTotal(float total) {
           this.total = total;
        }

        public float getPrice() {
            return price;
        }

       public void setItem(String item) {
           this.itemDescription = item;
       }

       public String getItem() {
            return itemDescription;
        }
        public void setPrice(float price) {
            this.price = price;
        }

        public float getQuantity() {
            return qty;
        }

        public void setQuantity(float quantity) {
            this.qty = quantity;
        }
}

