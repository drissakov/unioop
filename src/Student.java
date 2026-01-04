public class Student extends Person {

    private String group;

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + ", group " + group;
    }
}
