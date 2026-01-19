import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        // CREATE
        try (Connection conn = testDB.getConnection()) {

            PreparedStatement insert =
                    conn.prepareStatement(
                            "INSERT INTO students (name, age, group_name) VALUES (?, ?, ?)"
                    );

            insert.setString(1, "Alex");
            insert.setInt(2, 19);
            insert.setString(3, "CS-01");
            insert.executeUpdate();

            System.out.println("INSERT done");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // READ
        try (Connection conn = testDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            System.out.println("READ:");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("group_name")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // UPDATE
        try (Connection conn = testDB.getConnection()) {

            PreparedStatement update =
                    conn.prepareStatement(
                            "UPDATE students SET age = ? WHERE name = ?"
                    );

            update.setInt(1, 20);
            update.setString(2, "Alex");
            update.executeUpdate();

            System.out.println("UPDATE done");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // DELETE
        try (Connection conn = testDB.getConnection()) {

            PreparedStatement delete =
                    conn.prepareStatement(
                            "DELETE FROM students WHERE name = ?"
                    );

            delete.setString(1, "Alex");
            delete.executeUpdate();

            System.out.println("DELETE done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
