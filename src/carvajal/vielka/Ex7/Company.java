package carvajal.vielka.Ex7;

/**
 * Created by IE on 7/28/2016.
 */
public class Company {
    private String Name;
    private String Add;
    private String cellphone;
    private int iD;


    public Company() {
        this.Name = "XYZ Company";
        this.Add = "Ermita, Manila";
        this.cellphone = "0917-5554-123";
        this.iD = 0;
    }

    public Company(String Name, String Add, String cellphone, int iD) {
        this.iD = iD;
        this.Name = Name;
        this.Add = Add;
        this.cellphone = cellphone;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String Add) {
        this.Add = Add;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }


}
