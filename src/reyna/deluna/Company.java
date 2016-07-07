package reyna.deluna;

/**
 * Created by IE on 6/28/2016.
 */
public class Company {

    int[] CoId = new int[]{941253, 845602, 45936};
    String[] CoName = new String[]{"Toshiba", "Olay", "Nestle"};
    String[] address = {"Japan", "USA", "Philippines"};
    String[] phone = {"8969586", "1598631", "7865234"};

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
