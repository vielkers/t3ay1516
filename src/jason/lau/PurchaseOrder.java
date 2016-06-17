package jason.lau;

/**
 * Created by Jason on 6/7/2016.
 */
public class PurchaseOrder {
    private float ponum;
    private float quan;
    private String uom;
    private Items cases;

    public PurchaseOrder(float ponum, float quan, String uom, Items cases) {
        this.ponum = ponum;
        this.quan = quan;
        this.uom = uom;
        this.cases = cases;
    }

    public float getQuan() {
        return quan;
    }

    public void setQuan(float quan) {
        this.quan = quan;
    }

    public float getPonum() {
        return ponum;
    }

    public void setPonum(float ponum) {
        this.ponum = ponum;
    }

    public String getUom() {
        return uom;
    }

    public Items getCases() {
        return cases;
    }

    public void setCases(Items cases) {
        this.cases = cases;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public float getTotalPOPrice(){
        return cases.getPrice()*quan;

    }

}