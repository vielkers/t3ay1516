package joshua.juanson.FinalVersionsExercises.Exercise7;
public class Exercise7Company {

    private int[] CoId = new int[]{112, 113, 114, 115, 116};
    private String[] CoName = new String[]{"Pikachu Corp.", "Squirtle Corp.", "Bulbasaur Corp.", "Charmander Corp.", "Pidgey Corp."};
    private String[] address = new String[]{"Japan", "Los Angeles", "Philippines", "Antartica", "Heaven"};
    private String[] phone = new String[]{"222222", "3333333", "4444444", "5555555", "9129404759834"};

    public Exercise7Company(int[] id, String[] name, String[] address, String[] phone) {
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
