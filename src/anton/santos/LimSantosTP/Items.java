package anton.santos.LimSantosTP;

/**
 * Created by Anton on 7/28/2016.
 */
public class Items {

    String item;
    float qty;
    String uom;
    double price;
    int prNum;
    int shadowprNum;
    String department;

    //Constructor for PR. Note na wala pa sha price.
    public Items(String item, float qty, String uom) {
        this.item = item;
        this.qty = qty;
        this.uom = uom;
        this.price = 0;
        this.prNum = PR.prNumCount;
        this.shadowprNum = PR.prNumCount;
        this.department = PRadd.department;
        PRCheck.CheckPR.put(PR.prNumCount,shadowprNum);
        PRCheck.PriceCalc.put(PR.prNumCount, qty);
        PRCheck.ItemName.put(PR.prNumCount,item);

    }

    //Constructor for PO. Note na may price input na sha.


}
