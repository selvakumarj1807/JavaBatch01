
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "DELETE FROM students WHERE id = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 102); // Assuming you want to delete the student with id = 102

            int rowsAffected = pstmt.executeUpdate();

            System.out.println("Deleted " + rowsAffected + " student(s).");

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}