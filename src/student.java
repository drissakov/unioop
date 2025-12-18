public class student{
    private String firstName;
    private String lastName;
    private int age;
    private String group;
    private int course;
    private double averageGrade;

    student(String firstName, String lastName, int age, String group, int course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
}
