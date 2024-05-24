package Controller;

import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Transaksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransaksiController {
    
    public boolean tambahHistoryTransaksi(int id_akun, String namaMakanan, int jumlahPesanan, double harga, String status){
        String sql = "INSERT INTO transaksi (id_akun, nama_makanan, total_pesanan, total_harga, status) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id_akun);
            stmt.setString(2, namaMakanan);
            stmt.setInt(3, jumlahPesanan);
            stmt.setDouble(4, harga);
            stmt.setString(5, status);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
    public List<Transaksi> getAllRiwayatTransaksi(int idAkun){
        List<Transaksi> riwayatTransaksi = new ArrayList<>();
        
        String sql = "SELECT * FROM transaksi WHERE id_akun=?";
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idAkun);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id_Transaksi = rs.getInt("id_Transaksi");
                    int id_akun = rs.getInt("id_akun");
                    String namaMakanan = rs.getString("nama_makanan");
                    int totalPesanan = rs.getInt("total_pesanan");
                    double harga = rs.getDouble("total_harga");
                    String status = rs.getString("status");

                    Transaksi newDataTransaksi = new Transaksi(id_Transaksi, id_akun, namaMakanan, totalPesanan, harga, status);
                    riwayatTransaksi.add(newDataTransaksi);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return riwayatTransaksi;
    }
}
