
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url = "jdbc:mysql://localhost:3306/college";
    static String username = "root";
    static String password = "";

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);

    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();

            System.out.println("Connection successful!");

            conn.close();
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
