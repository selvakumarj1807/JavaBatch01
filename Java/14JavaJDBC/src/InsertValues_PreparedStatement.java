import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertValues_PreparedStatement {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students (id, name, email, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 102);
            pstmt.setString(2, "John Sam");
            pstmt.setString(3, "john.sam@example.com");
            pstmt.setInt(4, 85);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
