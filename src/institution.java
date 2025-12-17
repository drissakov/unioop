import java.util.List;

public class institution{
    private static int institutionID;
    private String institutionName;
    private String institutionAddress;
    private String institutionPhone;
    private List<student> students;

    institution(String institutionName,String institutionAddress,String institutionPhone){
        this.institutionName=institutionName;
        this.institutionAddress=institutionAddress;
        this.institutionPhone=institutionPhone;
    }

    public static void setInstitutionID(int institutionID) {
        institution.institutionID = institutionID;
    }
    public static int getInstitutionID() {
        return institutionID;
    }
    public String getInstitutionName() {
        return institutionName;
    }
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
    public String getInstitutionAddress() {
        return institutionAddress;
    }
    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }
    public String getInstitutionPhone() {
        return institutionPhone;
    }
    public void setInstitutionPhone(String institutionPhone) {
        this.institutionPhone = institutionPhone;
    }
    public List<student> getStudents() {
        return students;
    }
    public void setStudents(List<student> students) {
        this.students = students;
    }
}
