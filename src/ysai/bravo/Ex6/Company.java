package ysai.bravo.Ex6;

/**
 * Created by IE on 7/26/2016.
 */
public class Company {
    int[] CompanyId = new int[]{941253, 845602, 45936};
    String[] CompanyName = new String[]{"Unilever", "SC Johnson", "Nestle"};
    String[] address = {"United Kingdom", "USA", "Philippines"};
    String[] phone = {"8969586", "1598631", "7865234"};

    public Company(int[] id, String[] name, String[] address, String[] phone) {
        this.CompanyId = id;
        this.CompanyName = name;
        this.address = address;
        this.phone = phone;
        }
    public int[] getCompanyId(){
        return CompanyId;
        }
    public void setCompanyId(int[] coId) {
        this.CompanyId = coId;
        }

            public String[] getName() {
                return CompanyName;
            }
        public void setName(String[] name) {
        this.CompanyName = name;
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
