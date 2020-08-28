import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBService {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found");
        }
    }
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENTS_TEST", "root", "Novolitovskaya921");
        } catch (SQLException throwables) {
            throw new RuntimeException("Connection getting error");
        }
    }
}
