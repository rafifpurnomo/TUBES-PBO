package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfigDB {
    
    private static Connection mySQLconfig;
    
    public static Connection getConnection() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_tubes_pbo";
            String user  = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mySQLconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi gagal " + e.getMessage());
        }
        return mySQLconfig;
    }
}