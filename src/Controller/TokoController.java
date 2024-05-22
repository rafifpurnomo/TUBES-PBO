package Controller;

import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Toko;
import Model.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TokoController {
    
    public boolean tambahToko(int id_akun, String namaToko, String alamatToko) {
        String sql = "INSERT INTO toko (id_akun, nama_toko, alamat) VALUES (?, ?, ?)";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_akun);
            stmt.setString(2, namaToko);
            stmt.setString(3, alamatToko);

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
    
    public List<Toko> getAllToko(){
        List<Toko> ListToko = new ArrayList<>();
        String sql = "SELECT * FROM toko";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idToko = rs.getInt("id_toko");
                    int idAkun = rs.getInt("id_akun");
                    String namaToko = rs.getString("nama_toko");
                    String alamat = rs.getString("alamat");

                    Toko toko = new Toko(idToko, idAkun, namaToko, alamat);
                    ListToko.add(toko);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ListToko;
    }
    
    public Toko getTokoByNama(String namaToko) {
        String sql = "SELECT * FROM toko WHERE nama_toko=?";
        
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, namaToko);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int idAkun = rs.getInt("id_akun");
                    int idToko = rs.getInt("id_toko");
                    String nama_Toko = rs.getString("nama_toko");
                    String alamat = rs.getString("alamat");
                    
                    Toko newToko = new Toko(idAkun, idToko, namaToko, nama_Toko);
                    return newToko;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
