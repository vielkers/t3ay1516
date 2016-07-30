package matthew.reyes.Exercise6;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Company {
    private int ID;
    private String companyName;
    private String address;
    private String telephone;

    public Company() {
        this.ID = 0;
        this.companyName = "Reyes IT Foundation";
        this.address = "Silicon Valley, California, USA";
        this.telephone = "1-555-1994";
    }

    public Company(int ID, String companyName, String address, String telephone) {
        this.ID = ID;
        this.companyName = companyName;
        this.address = address;
        this.telephone = telephone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}