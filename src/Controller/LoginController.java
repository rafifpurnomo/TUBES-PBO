package Controller;

import Helper.ConfigDB;
import Model.DriverOnlineShop;
import Model.UserSession;
import View.Login;
import View.MenuAdmin;
import View.MenuPembeli;
import View.MenuPenjual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginController implements Model.Login{
    private Login asLogin;
    private DriverOnlineShop onlineShop;
    private MenuPembeli MPembeli;
    private MenuPenjual MPenjual;
    private MenuAdmin MAdmin;
    
    public LoginController(Login asLogin){
        this.asLogin = asLogin;
    }
    
    public void Login(String username, String password){
        
        String sql = "SELECT * FROM akun WHERE username=? AND password=?";
        
        try (Connection conn = ConfigDB.getConnection(); 
        PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    
                    String role = rs.getString("role");
                    String nama = rs.getString("nama");
                    String noTelpon = rs.getString("no_telpon");
                    int id = rs.getInt("id_akun");
                    
                    UserSession.setUsername(username);
                    UserSession.setNama(nama);
                    UserSession.setNoTelpon(noTelpon);
                    UserSession.setId(id);
                    
                    if (role.equals("Pembeli")) {
                        MPembeli = new MenuPembeli();
                        MPembeli.setVisible(true);
                        this.asLogin.dispose();
                    }  else if (role.equals("Penjual")) {
                        MPenjual = new MenuPenjual();
                        MPenjual.setVisible(true);
                        this.asLogin.dispose();
                    } else if (role.equals("Admin")) {
                        MAdmin = new MenuAdmin();
                        MAdmin.setVisible(true);
                        this.asLogin.dispose();
                    } else {
                        System.out.println("Akun Tidak Terdaftar");
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau password salah", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Peringantan", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverOnlineShop.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
