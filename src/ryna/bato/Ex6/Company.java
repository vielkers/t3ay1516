package ryna.bato.Ex6;

public class Company {

    public int id;
    public String name;
    public String address;
    public String phone;

    public Company() {
        this.id = 0;
        this.name = "ABC Corporation";
        this.address = "Taft Avenue, Manila, Philippines";
        this.phone = "955-8685";
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
