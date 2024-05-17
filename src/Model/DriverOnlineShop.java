package Model;

import Controller.AkunController;
import View.RegisterPembeli;
import View.RegisterPenjual;
import View.Login;
import View.UbahPassword;
import View.UbahNoTelpon;
import View.UbahNamaUser;
import View.UbahUsername;
import javax.swing.JOptionPane;

public class DriverOnlineShop {
    private RegisterPembeli asRegPembeli;
    private RegisterPenjual asRegPenjual;
    private UbahPassword asUbahPassword;
    private UbahNoTelpon asUbahNoTelpon;
    private UbahNamaUser asUbahNamaUser;
    private UbahUsername asUbahUsername;
    private Login asLogin;
    AkunController akunCNTRL;
    
    
    public DriverOnlineShop(RegisterPembeli asRegPembeli){
        this.asRegPembeli = asRegPembeli;
        akunCNTRL = new AkunController();
    }
    
    public DriverOnlineShop(RegisterPenjual asRegPenjual){
        this.asRegPenjual = asRegPenjual;
        akunCNTRL = new AkunController();
    }
    
    public DriverOnlineShop(UbahPassword asUbahPassword){
        this.asUbahPassword = asUbahPassword;
        akunCNTRL = new AkunController();
    }
    
    public DriverOnlineShop(UbahNoTelpon asUbahNoTelpon){
        this.asUbahNoTelpon = asUbahNoTelpon;
        akunCNTRL = new AkunController();
    }
    
    public DriverOnlineShop(UbahNamaUser asUbahNamaUser){
        this.asUbahNamaUser = asUbahNamaUser;
        akunCNTRL = new AkunController();
    }
    public DriverOnlineShop(UbahUsername asUbahUsername){
        this.asUbahUsername = asUbahUsername;
        akunCNTRL = new AkunController();
    }
    
    public Pembeli tambahAkunPembeli(String Nama, String Username, String Password, String role, String noTelpon){
        if (!Username.isEmpty() && !Password.isEmpty() && !Nama.isEmpty() && !noTelpon.isEmpty()) {
            Pembeli newPembeli = new Pembeli(Nama, Username, Password, role, noTelpon);
            newPembeli.setNama(Nama);
            newPembeli.setUsername(Username);
            newPembeli.setPassword(Password);
            newPembeli.setRole(role);
            newPembeli.setNoTelpon(noTelpon);
            return newPembeli;
            
        } else {
          return null;
            
        }
    }
    
    public Penjual tambahAkunPenjual(String Nama, String Username, String Password,  String role, String noTelpon){
        if (!Username.isEmpty() && !Password.isEmpty() && !Nama.isEmpty() && !noTelpon.isEmpty()) {
            Penjual newPenjual = new Penjual(Nama, Username, Password, role, noTelpon);
            newPenjual.setNama(Nama);
            newPenjual.setUsername(Username);
            newPenjual.setPassword(Password);
            newPenjual.setRole(role);
            newPenjual.setNoTelpon(noTelpon);
            return newPenjual;
            
        } else {
          return null;
            
        }
    }
    
    public void changePassword(String oldPassword, String newPassword, String confirmPassword) {
        if (newPassword.equals(confirmPassword)) {
            boolean success = akunCNTRL.UbahPassword(UserSession.getId(), oldPassword, newPassword);
            if (success) {
                JOptionPane.showMessageDialog(null, "Password berhasil diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Password lama salah!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password baru tidak cocok!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void changeNoTelp(String noTelpSekarang, String NoTelpBaru) {
        boolean success = akunCNTRL.UbahNoTelp(UserSession.getId(), noTelpSekarang, NoTelpBaru);
            
        if (success) {
            JOptionPane.showMessageDialog(null, "nomor telpon berhasil diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada !", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void changeNamaUser(String namaSekarang, String namaBaru) {
        boolean success = akunCNTRL.UbahNamaUser(UserSession.getId(), namaSekarang, namaBaru);
            
        if (success) {
            JOptionPane.showMessageDialog(null, "Nama Anda diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void Username(String UsernameSekarang, String UsernameBaru) {
        boolean success = akunCNTRL.UbahUsername(UserSession.getId(), UsernameSekarang, UsernameBaru);
            
        if (success) {
            JOptionPane.showMessageDialog(null, "Username Anda diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }



}
