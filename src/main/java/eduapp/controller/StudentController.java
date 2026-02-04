package eduapp.controller;

import eduapp.db.testDB;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Map<String, Object>> getStudents() {

        List<Map<String, Object>> students = new ArrayList<>();

        try (Connection conn = testDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                students.add(Map.of(
                        "id", rs.getInt("id"),
                        "name", rs.getString("name"),
                        "age", rs.getInt("age"),
                        "group", rs.getString("group_name")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    @PostMapping
    public String addStudent(@RequestBody Map<String, Object> body) {

        try (Connection conn = testDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO students (name, age, group_name) VALUES (?, ?, ?)"
             )) {

            stmt.setString(1, body.get("name").toString());
            stmt.setInt(2, (Integer) body.get("age"));
            stmt.setString(3, body.get("group").toString());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Student added";
    }
}
