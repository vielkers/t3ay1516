package anton.santos.Ex34567;

/**
 * Created by Anton on 7/30/2016.
 */
public class Company {

        private int vendorid;
        private String vendorname;
        private String vendoraddress;
        private String vendorphone;

        public Company() {
            this.vendorid = 0;
            this.vendorname = "Sun Gleam Corporation";
            this.vendoraddress = "Katipoonan Drive";
            this.vendorphone = "911-11-11";
        }

        public Company(int vendorid, String vendorname, String vendoraddress, String vendorphone) {
            this.vendorid = vendorid;
            this.vendorname = vendorname;
            this.vendoraddress = vendoraddress;
            this.vendorphone = vendorphone;
        }

    public int getVendorid() {
        return vendorid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public String getVendoraddress() {
        return vendoraddress;
    }

    public String getVendorphone() {
        return vendorphone;
    }

}
