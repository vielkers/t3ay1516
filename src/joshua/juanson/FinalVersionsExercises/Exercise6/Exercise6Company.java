package joshua.juanson.FinalVersionsExercises.Exercise6;
public class Exercise6Company {
    private int refNumber;
    private String companyName;
    private String companyAddress;
    private String companyContact;
    public Exercise6Company ()
    {
        this.refNumber = 0;
        this.companyName = "JAT Board Enterprises";
        this.companyAddress = "Marikina City";
        this.companyContact = "682-33-66";
    }
    public Exercise6Company (int refNumber, String companyName, String companyAddress, String companyContact)
    {
        this.refNumber=refNumber;
        this.companyName=companyName;
        this.companyAddress=companyAddress;
        this.companyContact=companyContact;
    }
    //Different Methods
    public int getRefNumber()
    {
        return refNumber;
    }
    public void setRefNumber (int refNumber)
    {
        this.refNumber=refNumber;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public void setCompanyName (String companyName)
    {
        this.companyName=companyName;
    }
    public String getCompanyAddress()
    {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress)
    {
        this.companyAddress=companyAddress;
    }
    public String getCompanyContact() {
        return companyContact;
    }
    public void setCompanyContact (String companyContact)
    {
        this.companyContact=companyContact;
    }
}
