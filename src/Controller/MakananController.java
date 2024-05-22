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
                    int idToko = rs.getInt("id_toko");
                    String namaMakanan = rs.getString("nama_makanan");
                    int stok = rs.getInt("stok");
                    double harga = rs.getDouble("harga"); // Menggunakan getDouble untuk harga

                    Makanan makanan = new Makanan(idToko, namaMakanan, stok, harga);
                    makananList.add(makanan);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }
        return makananList;
    }
}
    
