import java.sql.Connection;
import java.sql.Statement;

public class InsertValues_Statement {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO students (id, name, email, marks) VALUES (101, 'John Doe', 'john.doe@example.com', 85)";
            
            int rowsInserted = stmt.executeUpdate(sql);

            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
