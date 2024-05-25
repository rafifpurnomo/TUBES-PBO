package Controller;


import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.Pembeli;
import Model.Penjual;
import Model.Toko;
import View.Login;
import View.RegisterPembeli;
import View.MenuAdmin;
import View.MenuPembeli;
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


public class AkunController {
    private Login asLogin;
    private DriverOnlineShop appdriver;
    private MenuPembeli MPembeli;
    private MenuPenjual MPenjual;
    private MenuAdmin MAdmin;
    private RegisterPembeli regPEMBELI; 
    
    
    public boolean daftarAkun(String nama, String Username, String password, String role, String noTelpon) {
    String sql = "INSERT INTO akun (nama, username, password, role, no_telpon) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nama);
            stmt.setString(2, Username);
            stmt.setString(3, password);
            stmt.setString(4, role);
            stmt.setString(5, noTelpon);

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
    
    public int getTotalAkun(){
        String sql = "SELECT COUNT(*) AS total FROM akun";
        int totalAkun = 0;

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                totalAkun = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace to help with debugging
        }

        return totalAkun;
    }
    
    public int getTotalAkunPenjual(){
        String sql = "SELECT COUNT(*) AS total FROM akun WHERE role='penjual'";
        int totalAkun = 0;

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                totalAkun = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace to help with debugging
        }

        return totalAkun;
    }
    
    public int getTotalAkunPembeli(){
        String sql = "SELECT COUNT(*) AS total FROM akun WHERE role='pembeli'";
        int totalAkun = 0;

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                totalAkun = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace to help with debugging
        }

        return totalAkun;
    }
    
    public int getTotalAkunAdmin(){
        String sql = "SELECT COUNT(*) AS total FROM akun WHERE role='Admin'";
        int totalAkun = 0;

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                totalAkun = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace to help with debugging
        }

        return totalAkun;
    }
    
    public List<Pembeli> getAllPembeli(){
        List<Pembeli> listAkunPembeli = new ArrayList<>();

        String sql = "SELECT * FROM akun WHERE role='pembeli'";
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int idAkun = rs.getInt("id_akun");
                String nama = rs.getString("nama");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String noTelp = rs.getString("no_telpon");

                Pembeli newPembeli = new Pembeli(idAkun, nama, username, password, role, noTelp);
                listAkunPembeli.add(newPembeli);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listAkunPembeli;
    }
    
    public List<Penjual> getAllPenjual(){
        List<Penjual> listAkunPenjual = new ArrayList<>();

        String sql = "SELECT a.*, t.id_toko, t.nama_toko, t.alamat " +
                     "FROM akun a " +
                     "LEFT JOIN toko t ON a.id_akun = t.id_akun " +
                     "WHERE a.role = 'penjual'";
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int idAkun = rs.getInt("id_akun");
                String nama = rs.getString("nama");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String noTelp = rs.getString("no_telpon");
                int idToko = rs.getInt("id_toko");
                String namaToko = rs.getString("nama_toko");
                String alamatToko = rs.getString("alamat");

                Penjual newPenjual = new Penjual(idAkun, nama, username, password, role, noTelp);
                Toko tokoPenjual = new Toko(idToko, idAkun,namaToko, alamatToko);
                newPenjual.setToko(tokoPenjual);

                listAkunPenjual.add(newPenjual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listAkunPenjual;    
    }

    public boolean hapusAkun(int idAkun) {
        String sqlDeleteAkun = "DELETE FROM akun WHERE id_akun = ?";
        String sqlDeleteKeranjang = "DELETE FROM keranjang WHERE id_akun=?";
        String sqlDeleteTransaksi = "DELETE FROM transaksi WHERE id_akun=?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmtDeleteKeranjang = conn.prepareStatement(sqlDeleteKeranjang);
             PreparedStatement stmtDeleteAkun = conn.prepareStatement(sqlDeleteAkun);
             PreparedStatement stmtDeleteTransaksi = conn.prepareStatement(sqlDeleteTransaksi)) {

            stmtDeleteTransaksi.setInt(1, idAkun);
            stmtDeleteTransaksi.executeUpdate();
            
            stmtDeleteKeranjang.setInt(1, idAkun);
            stmtDeleteKeranjang.executeUpdate();
            
            stmtDeleteAkun.setInt(1, idAkun);
            int rowsAkunDeleted = stmtDeleteAkun.executeUpdate();
            
            return (rowsAkunDeleted > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean hapusPenjual(int idAkun, int idToko) {
        String sqlDeleteToko = "DELETE FROM toko WHERE id_akun = ?";
        String sqlDeleteAkun = "DELETE FROM akun WHERE id_akun = ?";
        String sqlDeleteMakanan = "DELETE FROM makanan WHERE id_toko = ?";

        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmtDeleteMakanan = conn.prepareStatement(sqlDeleteMakanan);
             PreparedStatement stmtDeleteToko = conn.prepareStatement(sqlDeleteToko);
             PreparedStatement stmtDeleteAkun = conn.prepareStatement(sqlDeleteAkun)) {
            
            stmtDeleteMakanan.setInt(1, idToko);
            stmtDeleteMakanan.executeUpdate();
            
            stmtDeleteToko.setInt(1, idAkun);
            stmtDeleteToko.executeUpdate();

            stmtDeleteAkun.setInt(1, idAkun);
            int rowsDeleted = stmtDeleteAkun.executeUpdate();

            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }




}
