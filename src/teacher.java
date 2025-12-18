import java.util.List;

public class teacher{
    private String firstName;
    private String lastName;
    private String subject;
    private int experienceYears;
    private institution institution;

    private List<group> groups;

    teacher(String firstName, String lastName, String subject, int experienceYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public void  setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setExperienceYears(int experienceYears){
        this.experienceYears=experienceYears;
    }
    public int getExperienceYears(){
        return experienceYears;
    }
    public void setInstitution(institution institution){
        this.institution=institution;
    }
    public institution getInstitution(){
        return institution;
    }


}
