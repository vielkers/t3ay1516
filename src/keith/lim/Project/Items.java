package keith.lim.Project;

/**
 * Created by kiiiiibble on 7/22/2016.
 */

/*ITEMS CLASS
The only important things for the PR and PO in terms of identifying characteristics of items
for the PR are the item, UOM, and the qty. For the PO, however, you'll need to have a price tag
attached to it, hence the two different constructors.
 */
public class Items {

    String item;
    double qty;
    String uom;
    double price;

    //Constructor for PR. Note na wala pa sha price.
    public Items(String item, double qty, String uom) {
        this.item = item;
        this.qty = qty;
        this.uom = uom;
        this.price = 0;
    }

    //Constructor for PO. Note na may price input na sha.
    public Items(String item, double qty, String uom, double price) {
        this.item = item;
        this.qty = qty;
        this.uom = uom;
        this.price = price;
    }

}
