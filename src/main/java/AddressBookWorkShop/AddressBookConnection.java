package AddressBookWorkShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AddressBookConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/AddressBook?useSSL=false";
    public static final String USER = "root";
    public static final String PASSWORD = "Peddamavaya_1952@";
    public static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}