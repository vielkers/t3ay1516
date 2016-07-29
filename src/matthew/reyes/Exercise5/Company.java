package src.matthew.reyes.Exercise5;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Company {
    private int iD;
    private String name;
    private String address;
    private String telephone;

    public Company () {
        this.iD = 1;
        this.name = "Reyes IT Corporation";
        this.address = "Silicon Valley, California, USA";
        this.telephone = "1-555-1994";
    }

    public Company(int iD, String name, String address, String telephone) {
        this.iD = iD;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
