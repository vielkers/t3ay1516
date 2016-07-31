package jason.lau.Ex5;

/**
 * Created by Jason on 7/26/2016.
 */
public class Company {
        private int ID;
        private String Name;
        private String Add;
        private String Num;


        public Company() {
            this.ID= 1001;
            this.Name = "Lau Incorporated";
            this.Add = "Taft Avenue, Manila, Philippines";
            this.Num = "812-52-62";
        }

          public Company(int ID, String name, String add, String num) {
            this.ID = ID;
            Name = name;
            Add = add;
            Num = num;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }
}
