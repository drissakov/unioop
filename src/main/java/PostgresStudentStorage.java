import eduapp.db.testDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostgresStudentStorage implements StudentStorage {

    @Override
    public void addStudent(String name, int age, String group) {
        try (Connection conn = testDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO students (name, age, group_name) VALUES (?, ?, ?)"
             )) {

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, group);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();

        try (Connection conn = testDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                students.add(
                        rs.getString("name") + ", " +
                                rs.getInt("age") + ", " +
                                rs.getString("group_name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    @Override
    public void updateStudentAge(String name, int newAge) {
        try (Connection conn = testDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "UPDATE students SET age = ? WHERE name = ?"
             )) {

            stmt.setInt(1, newAge);
            stmt.setString(2, name);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(String name) {
        try (Connection conn = testDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "DELETE FROM students WHERE name = ?"
             )) {

            stmt.setString(1, name);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
