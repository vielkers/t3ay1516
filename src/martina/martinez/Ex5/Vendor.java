package martina.martinez.Ex5;

public class Vendor {
    private int id;
    private String name;
    private String address;
    private String phone;

    public Vendor() {
        this.id = 0;
        this.name = "Company 1";
        this.address = "Manila";
        this.phone = "8295627";
    }

    public Vendor(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
