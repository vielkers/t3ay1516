package aranguren.bernadette;

public class Company {

    int[] CoId = new int[]{112, 113, 114, 115, 116};
    String[] CoName = new String[]{"Sky Kitchen", "Gate Gourmet", "HACOR Inc.", "TFK Corporation", "LSG Sky Chefs"};
    String[] address = new String[]{"MNL", "LHR", "LAX", "HND", "BKK"};
    String[] phone = new String[]{"121212", "343434", "565656", "787878", "909090"};

    public Company(int[] id, String[] name, String[] address, String[] phone) {
        this.CoId = id;
        this.CoName = name;
        this.address = address;
        this.phone = phone;
    }

    public int[] getCoId() {
        return CoId;
    }

    public void setCoId(int[] coId) {
        this.CoId = coId;
    }

    public String[] getName() {
        return CoName;
    }

    public void setName(String[] name) {
        this.CoName = name;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }
}