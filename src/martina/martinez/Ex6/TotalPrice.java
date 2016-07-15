package martina.martinez.Ex6;

/**
 * Created by IE on 7/15/2016.
 */
public class TotalPrice {
    public static void main(String[] args) {

        float totalPrice = 0;

        Company company = new Company(1,"Company Name","Company Address","1234567890");

        Item[] item = new Item[] {
                new Item(1, "Item Description 1", "Item Type 1", 1),
                new Item(2, "Item Description 2", "Item Type 2", 2)
        };

        float[] quantity = {1,2};
        String[] UnitOfMeasure = {"Unit 1", "Unit 2"};

        PurchaseOrder PO = new PurchaseOrder(1, item, quantity, UnitOfMeasure);

        float discount = 10;
        float vat = 12;

        System.out.println("");
        System.out.println("Purchase Order");
        System.out.println("PO Number: " + PO.getPONumber());

        System.out.println("");
        System.out.println("Company Information");
        System.out.println("Company ID: " + company.getId());
        System.out.println("Company Name: " + company.getName());
        System.out.println("Company Address: " + company.getAddress());
        System.out.println("Company Phone Number: " + company.getPhoneNumber());

        System.out.println("");
        System.out.println("Item Information");
        for(int i = 0; i < item.length ; i++){
            System.out.println("");
            System.out.println("Item Information");
            System.out.println("Description: " + item[i].getItemDescription());
            System.out.println("Quantity: " + PO.getQuantity()[i]);
            System.out.println("Type: " + item[i].getItemType());
            System.out.println("Price: " + item[i].getPrice());
            System.out.println("Unit of Measure: " + PO.getUnitOfMeasure()[i]);
        }

        for(int i = 0; i < item.length ; i++){
            totalPrice += item[i].getPrice() * PO.getQuantity()[i];
        }

        System.out.println("");
        System.out.println("Subtotal = " + totalPrice);
        System.out.println("Discount (" + discount + "%) = " + (totalPrice * discount / 100));
        System.out.println("vat (" + vat + "%) = " + (totalPrice * vat / 100));
        System.out.println("Total = " + (totalPrice - totalPrice * discount / 100 - totalPrice * vat / 100));
    }
}
