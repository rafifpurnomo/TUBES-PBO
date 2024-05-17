package Controller;


import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Pembeli;
import Model.Penjual;
import View.Login;
import View.RegisterPembeli;
import View.MenuAdmin;
import View.MenuPembeli;
import View.MenuPenjual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AkunController {
    private Login asLogin;
    private DriverOnlineShop appdriver;
    private MenuPembeli MPembeli;
    private MenuPenjual MPenjual;
    private MenuAdmin MAdmin;
    private RegisterPembeli regPEMBELI; 
    
    
    public boolean regPembeli(Pembeli newPembeli) {
    String sql = "INSERT INTO akun (nama, username, password, role, no_telpon) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

//            System.out.println("Inserting: " + newPembeli.getNama() + ", " + newPembeli.getUsername() + ", " + newPembeli.getPassword() 
//                + ", " + newPembeli.getRole() + ", " + newPembeli.getNoTelpon());
            stmt.setString(1, newPembeli.getNama());
            stmt.setString(2, newPembeli.getUsername());
            stmt.setString(3, newPembeli.getPassword());
            stmt.setString(4, newPembeli.getRole());
            stmt.setString(5, newPembeli.getNoTelpon());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
    public boolean regPenjual(Penjual newPenjual) {
    String sql = "INSERT INTO akun (nama, username, password, role, no_telpon) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

//            System.out.println("Inserting: " + newPenjual.getNama() + ", " + newPenjual.getUsername() + ", " + newPenjual.getPassword() 
//                + ", " + newPenjual.getRole() + ", " + newPenjual.getNoTelpon());
            stmt.setString(1, newPenjual.getNama());
            stmt.setString(2, newPenjual.getUsername());
            stmt.setString(3, newPenjual.getPassword());
            stmt.setString(4, newPenjual.getRole());
            stmt.setString(5, newPenjual.getNoTelpon());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
    public boolean UbahPassword(int userId, String oldPassword, String newPassword) {
        String sql = "UPDATE akun SET password=? WHERE id_akun=? AND password=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newPassword);
            stmt.setInt(2, userId);
            stmt.setString(3, oldPassword);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean UbahNoTelp(int userId, String noTelpSekarang, String NoTelpBaru) {
        String sql = "UPDATE akun SET no_telpon=? WHERE id_akun=? AND no_telpon=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, NoTelpBaru);
            stmt.setInt(2, userId);
            stmt.setString(3, noTelpSekarang);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean UbahNamaUser(int userId, String namaSekarang, String namaBaru) {
        String sql = "UPDATE akun SET nama=? WHERE id_akun=? AND nama=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, namaBaru);
            stmt.setInt(2, userId);
            stmt.setString(3, namaSekarang);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean UbahUsername(int userId, String UsernameSekarang, String UsernameBaru) {
        String sql = "UPDATE akun SET username=? WHERE id_akun=? AND username=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, UsernameBaru);
            stmt.setInt(2, userId);
            stmt.setString(3, UsernameSekarang);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }


}
