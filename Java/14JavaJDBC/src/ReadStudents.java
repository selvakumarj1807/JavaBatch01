import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadStudents {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM students";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int marks = rs.getInt("marks");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Marks: " + marks);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
