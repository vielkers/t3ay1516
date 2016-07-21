package keith.lim.ex5;

/**
 * Created by kiiiiibble on 7/20/2016.
 */
public class Company {

    private int id;
    private String name;
    private String address;
    private String phone;

    public Company(){

        this.id = 0;
        this.name = "ABC Corp";
        this.address = "123 Seaseme Street";
        this.phone = "87000";
    }

    public Company(int id, String name, String address, String phone) {
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
