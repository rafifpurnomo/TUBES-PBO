package Model;

import Helper.ConfigDB;
import Model.Akun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class appDriver {
    ConfigDB koneksi;
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    Statement st;
    
   public Akun Login(String username, String password){
        String sql = "SELECT * FROM akun WHERE username=? and password=?";
         
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Akun(rs.getString("nama"), rs.getString("username"),
                                    rs.getString("password"), rs.getString("role"),
                                    rs.getString("no_telpon"));
                } else {
                    return null; // Jika tidak ada data yang cocok
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(appDriver.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
