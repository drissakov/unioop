public class teacher{
    private String firstName;
    private String lastName;
    private int age;
    private String subject;        // Предмет
    private int experienceYears;   // Стаж
    private double salary;
    private institution institution;

    teacher(String firstName, String lastName, int age, String subject, int experienceYears, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subject = subject;
        this.experienceYears = experienceYears;
        this.salary = salary;
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
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
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
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setInstitution(institution institution){
        this.institution=institution;
    }
    public institution getInstitution(){
        return institution;
    }


}
