
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "Ram");
            pstmt.setInt(2, 95);
            pstmt.setInt(3, 102); // Assuming we are updating the student with id 102

            int rowsAffected = pstmt.executeUpdate();

            System.out.println("Rows updated: " + rowsAffected);

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
