import java.util.List;

public interface StudentStorage {

    void addStudent(String name, int age, String group);

    List<String> getAllStudents();

    void updateStudentAge(String name, int newAge);

    void deleteStudent(String name);
}

