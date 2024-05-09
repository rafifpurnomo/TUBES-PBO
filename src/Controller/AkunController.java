package Controller;

import Helper.ConfigDB;
import View.Login;
import Model.Akun;
import Model.appDriver;
import View.MenuAdmin;
import View.MenuPembeli;
import View.MenuPenjual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AkunController {
    private Login asLogin;
    private appDriver appdriver; // Mengubah jenis data dari appDriver menjadi appDriver
    private JTextField usernameLogin;
    private JPasswordField passwordLogin;
    private MenuPembeli MPembeli;
    private MenuPenjual MPenjual;
    private MenuAdmin MAdmin;
    
    public AkunController(Login asLogin){
        this.asLogin = asLogin;
        appdriver = new appDriver();
    }
    
    public void masuk(){
        usernameLogin = asLogin.usernameLogin();
        passwordLogin = asLogin.passLogin();
        
        String username = usernameLogin.getText();
        String password = passwordLogin.getText();
        
        if (username.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username atau Passwoard tidak boleh kosong");
        } else {
            
            Akun loginUser = appdriver.Login(username, password); // Menggunakan objek appdriver
            
            if (loginUser != null) {
                if (loginUser.getRole().equals("Pembeli")) {
                    MPembeli = new MenuPembeli();
                    MPembeli.setVisible(true);
                    this.asLogin.dispose();
                } else if(loginUser.getRole().equals("Penjual")){
                    MPenjual = new MenuPenjual();
                    MPenjual.setVisible(true);
                    this.asLogin.dispose();
                } else if(loginUser.getRole().equals("Admin")){
                    MAdmin = new MenuAdmin();
                    MAdmin.setVisible(true);
                    this.asLogin.dispose();
                } else {
                     JOptionPane.showMessageDialog(null, "Akun tidak terdaftar");
                     usernameLogin.setText("");
                     passwordLogin.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password");
                usernameLogin.setText("");
                passwordLogin.setText("");            
            }
        }
    }
}
