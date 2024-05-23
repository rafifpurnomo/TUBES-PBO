package Controller;

import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Keranjang;
import View.addToKeranjang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KeranjangController {
    private addToKeranjang asAddToKeranjang;
    
    public List<Keranjang> getKeranjangByAkun(int id_akun) {
        List<Keranjang> keranjangList = new ArrayList<>();
        String sql = "SELECT * FROM keranjang WHERE id_akun = ?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_akun);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idKeranjang = rs.getInt("id_keranjang");
                    int idMakanan = rs.getInt("id_makanan");
                    String namaMakanan = rs.getString("nama_makanan");
                    int banyakMakanan = rs.getInt("banyak_makanan");
                    double jumlahHarga = rs.getDouble("jumlah_harga");
                    
                    Keranjang data = new Keranjang(idKeranjang, id_akun, idMakanan, namaMakanan, banyakMakanan, jumlahHarga);
                    keranjangList.add(data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return keranjangList;
    }
    
    public boolean tambahKeranjang(int id_akun, int id_makanan, String nama_makanan, int banyak_makanan, double total_harga){
        String sql = "INSERT INTO keranjang (id_akun, id_makanan, nama_makanan, banyak_makanan, jumlah_harga) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id_akun);
            stmt.setInt(2, id_makanan);
            stmt.setString(3, nama_makanan);
            stmt.setInt(4, banyak_makanan);
            stmt.setDouble(5, total_harga);
            
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
}
