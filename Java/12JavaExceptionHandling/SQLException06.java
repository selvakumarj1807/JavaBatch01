import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLException06 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydatabase", 
                "username", 
                "password"
            );

            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}
