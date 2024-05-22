package Controller;

import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Toko;
import Model.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TokoController {
    
    public boolean tambahToko(Toko newToko) {
        String sql = "INSERT INTO toko (id_akun, nama_toko, alamat) VALUES (?, ?, ?)";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, newToko.getId_akun());
            stmt.setString(2, newToko.getNamaToko());
            stmt.setString(3, newToko.getAlamatToko());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean gantiNamaToko(int id_akun, String newNamaToko) {
        String sql = "UPDATE toko SET nama_toko=? WHERE id_akun=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newNamaToko);
            stmt.setInt(2, id_akun);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean gantiAlamatToko(int id_akun, String newAlamatToko) {
        String sql = "UPDATE toko SET alamat=? WHERE id_akun=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newAlamatToko);
            stmt.setInt(2, id_akun);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
}
