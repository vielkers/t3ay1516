package arvin.ymson.Exercise5;

/**
 * Created by arvin_000 on 6/25/2016.
 */
public class CompanyEx5 {
    private String name;
    private String address;
    private int contactNumber;

    public CompanyEx5 (String name, String address, int contactNumber) {

        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
