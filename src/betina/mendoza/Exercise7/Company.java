package betina.mendoza.Exercise7;

public class Company{
    private String name;
    private String address;
    private String id;
    private int number;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Company(String id, String name, String address, int number){
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;

    }
}