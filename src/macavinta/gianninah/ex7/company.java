package macavinta.gianninah.ex7;

/**
 * Created by IE on 7/28/2016.
 */
public class company {
    private String Name;
    private String Address;
    private String number;
    private int iD;


    public company() {
        this.Name = "Company";
        this.Address = "Manila";
        this.number = "8091471";
        this.iD = 123125;
    }

    public company(String Name, String Address, String number, int iD) {
        this.iD = iD;
        this.Name = Name;
        this.Address = Address;
        this.number = number;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }


}