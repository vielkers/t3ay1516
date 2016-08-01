package aguirre.erika.AguirreEx5;

public class AguirreEx5Comp {
    private int id;
    private String name;
    private String address;
    private String contactnum;

    public AguirreEx5Comp() {
        this.id = 0;
        this.name = "San Miguel Mills, Inc.";
        this.address = "Tabangao, Batangas City, Philippines";
        this.contactnum = "123-4567";
    }

    public AguirreEx5Comp(int id, String name, String address, String contactnum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactnum = contactnum;
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

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }
}
