import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    //private static final String URL = "jdbc:mysql://localhost:3306/pharmacy_project?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String URL = "jdbc:mysql://localhost:3306/pharmacy_project?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = ""; // άφησέ το κενό αν δεν έχεις password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // φορτώνει τον driver
            System.out.println("MySQL driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
