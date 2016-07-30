package anton.santos.LimSantosTP;

/**
 * Created by Anton on 7/28/2016.
 */
public class Supplier {

    int id;
    String name;
    String address;
    static int poCounter;
    int poCount;
    float cost;
    double qty;
    String iName;
    int pReference;

    public Supplier(int id, String name, String address, float cost,double qty, String iName,int pReference) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cost = cost;
        poCounter++;
        this.poCount = poCounter;
        this.qty = qty;
        this.iName = iName;
        this.pReference = pReference;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

