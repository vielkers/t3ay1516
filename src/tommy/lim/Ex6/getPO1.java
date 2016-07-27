package tommy.lim.Ex6;

/**
 * Created by IE on 7/26/2016.
 */
public class getPO1 {
    private int ponumber;
    private Company vendor;
    private String date;
    private Item6[] products;

    public getPO1() {
    }




    public getPO1(int ponumber, Company vendor, String date, Item6[] products) {
        this.ponumber = ponumber;
        this.vendor = vendor;
        this.date = date;
        this.products = products;
    }

    public int getPonumber() {
        return ponumber;
    }

    public void setPonumber(int ponumber) {
        this.ponumber = ponumber;
    }

    public Company getVendor() {
        return vendor;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Item6[] getProducts() {
        return products;
    }

    public void setProducts(Item6[] products) {
        this.products = products;
    }

    public float getPOTotal (getPO1 PO){

        float POTotal = 0;

        for(int n=0; n<products.length; n++ ){
            POTotal += Item6.getTotalPO(products[n]);
        }

        return POTotal;
    }
}
