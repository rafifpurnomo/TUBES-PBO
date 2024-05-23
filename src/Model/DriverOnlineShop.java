package Model;

import Controller.AkunController;
import Controller.KeranjangController;
import Controller.MakananController;
import Controller.TokoController;
import View.EditDataMakanan;
import View.RegisterPembeli;
import View.RegisterPenjual;
import View.Login;
import View.MenuPembeli;
import View.MenuPenjual;
import View.SetDataToko;
import View.UbahAlamatToko;
import View.UbahPassword;
import View.UbahNoTelpon;
import View.UbahNamaUser;
import View.UbahUsername;
import View.UbahNamaToko;
import View.addToKeranjang;
import View.tambahDataMakanan;
import javax.swing.JOptionPane;

public class DriverOnlineShop {
    private RegisterPembeli asRegPembeli;
    private RegisterPenjual asRegPenjual;
    private UbahPassword asUbahPassword;
    private UbahNoTelpon asUbahNoTelpon;
    private UbahNamaUser asUbahNamaUser;
    private UbahUsername asUbahUsername;
    private UbahNamaToko asUbahNamaToko;
    private UbahAlamatToko asUbahAlamatToko;
    private MenuPenjual asMenuPenjual;
    private EditDataMakanan asEditDataMakanan;
    private tambahDataMakanan asTambahDataMakanan;
    private MenuPembeli asMenuPembeli;
    private addToKeranjang asAddToKeranjang;
    
    Login asLogin;
    AkunController akunCNTRL;
    TokoController tokoCNTRL;
    MakananController mknCNTRL;
    KeranjangController keranjangCNTRL;
    
    
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
    
    public DriverOnlineShop(MenuPenjual asMenuPenjual){
        this.asMenuPenjual = asMenuPenjual;
        akunCNTRL = new AkunController();
        tokoCNTRL = new TokoController();
    }
    
    public DriverOnlineShop(MenuPembeli asMenuPembeli){
        this.asMenuPembeli = asMenuPembeli;
        akunCNTRL = new AkunController();
        tokoCNTRL = new TokoController();
        mknCNTRL = new MakananController();
    }
    
    public DriverOnlineShop(SetDataToko asSetDataToko){
        this.asMenuPenjual = asMenuPenjual;
        akunCNTRL = new AkunController();
        tokoCNTRL = new TokoController();
    }
    
    public DriverOnlineShop(UbahNamaToko asUbahNamaToko){
        this.asUbahNamaToko = asUbahNamaToko;
        tokoCNTRL = new TokoController();
    }
    
    public DriverOnlineShop(UbahAlamatToko asUbahAlamatToko){
        this.asUbahAlamatToko = asUbahAlamatToko;
        tokoCNTRL = new TokoController();
    }
    
    public DriverOnlineShop(EditDataMakanan asEditDataMakanan){
        this.asEditDataMakanan = asEditDataMakanan;
        tokoCNTRL = new TokoController();
    }
    
    public DriverOnlineShop(tambahDataMakanan asTambahDataMakanan){
        this.asTambahDataMakanan = asTambahDataMakanan;
        tokoCNTRL = new TokoController();
    }
    
    public DriverOnlineShop(addToKeranjang asAddToKeranjang){
        this.asAddToKeranjang = asAddToKeranjang;
        tokoCNTRL = new TokoController();
        keranjangCNTRL = new KeranjangController();
        mknCNTRL = new MakananController();
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
            Penjual newPenjual = new Penjual(Nama, Username, Password, role, noTelpon, null);
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
    
    public void tambahToko(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Nama toko anda diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void changeNamaToko(int id_akun, String namaBaru) {
        boolean success = tokoCNTRL.gantiNamaToko(id_akun, namaBaru);
            
        if (success) {
            JOptionPane.showMessageDialog(null, "Nama toko anda diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void changeAlamatToko(int id_akun, String namaBaru) {
        boolean success = tokoCNTRL.gantiAlamatToko(id_akun, namaBaru);
            
        if (success) {
            JOptionPane.showMessageDialog(null, "Alamat toko anda diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void updateMakanan(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Data makanan anda diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void hapusMakanan(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Data makanan berhasil di hapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void tambahMakanan(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Data makanan berhasil di tambahkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void tambahKeranjang(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "makanan berhasil ditambahkan ke keranjang!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void cekStokAfterCO(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "stok berubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    } 
}
