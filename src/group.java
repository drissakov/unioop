import java.util.List;

public class group {
    private String groupName;
    private List<student> students;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setStudents(List<student> students) {
        this.students = students;
    }
    public List<student> getStudents() {
        return students;
    }
}
