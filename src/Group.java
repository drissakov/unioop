import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Student> students = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public String toString() {
        return "Group " + name + ", students: " + students.size();
    }
}