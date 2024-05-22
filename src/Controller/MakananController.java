package Controller;

import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Makanan;
import Model.Toko;
import Model.UserSession;
import View.MenuPenjual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MakananController {
    
    private MenuPenjual asMenuPenjual;
    
    public void MakananController(MenuPenjual asMenuPenjual){
        this.asMenuPenjual = asMenuPenjual;
        
    }
    
    public List<Makanan> getMakananByToko(int idtoko) {
        List<Makanan> makananList = new ArrayList<>();
        String sql = "SELECT * FROM makanan WHERE id_toko = ?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idtoko);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idMakanan = rs.getInt("id_makanan");
                    int idToko = rs.getInt("id_toko");
                    String namaMakanan = rs.getString("nama_makanan");
                    int stok = rs.getInt("stok");
                    double harga = rs.getDouble("harga");

                    Makanan makanan = new Makanan(idMakanan, idToko, namaMakanan, stok, harga);
                    makananList.add(makanan);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return makananList;
    }
    
    public boolean updateMakanan(int id_makanan, String namaMakanan, double harga, int stok){
        String sql = "UPDATE makanan SET nama_makanan=?, harga=?, stok=? WHERE id_makanan=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, namaMakanan);
            stmt.setDouble(2, harga);
            stmt.setInt(3, stok);
            stmt.setInt(4, id_makanan);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean hapusMakanan(int id_makanan){
        String sql = "DELETE FROM makanan WHERE id_makanan = ?";
    
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_makanan);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }        
    }
    
    public boolean tambahMakanan(int id_toko, String namaMakanan, double harga, int stok){
        String sql = "INSERT INTO makanan (id_toko, nama_makanan, harga, stok) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_toko);
            stmt.setString(2, namaMakanan);
            stmt.setDouble(3, harga);
            stmt.setInt(4, stok);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
    
}
    
