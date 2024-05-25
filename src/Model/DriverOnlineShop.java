package Model;

import Controller.AkunController;
import Controller.KeranjangController;
import Controller.MakananController;
import Controller.TokoController;
import View.Checkout;
import View.DeletePembeli;
import View.DeletePenjual;
import View.EditDataMakanan;
import View.RegisterPembeli;
import View.RegisterPenjual;
import View.Login;
import View.MenuAdmin;
import View.MenuPembeli;
import View.MenuPenjual;
import View.SetDataToko;
import View.TambahAdminBaru;
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
    private MenuAdmin asMenuAdmin;
    private TambahAdminBaru asTambahAdminBaru;
    private addToKeranjang asAddToKeranjang;
    private Checkout asCheckout;
    private DeletePembeli asDeletePembeli;
    private SetDataToko asSetDataToko;
    private DeletePenjual asDeletePenjual;
    
    Login asLogin;
    AkunController akunCNTRL;
    TokoController tokoCNTRL;
    MakananController mknCNTRL;
    KeranjangController keranjangCNTRL;
    
    
    
    public DriverOnlineShop(RegisterPembeli asRegPembeli){
        this.asRegPembeli = asRegPembeli;
    }
    
    public DriverOnlineShop(RegisterPenjual asRegPenjual){
        this.asRegPenjual = asRegPenjual;
    }
    
    public DriverOnlineShop(UbahPassword asUbahPassword){
        this.asUbahPassword = asUbahPassword;
    }
    
    public DriverOnlineShop(UbahNoTelpon asUbahNoTelpon){
        this.asUbahNoTelpon = asUbahNoTelpon;
    }
    
    public DriverOnlineShop(UbahNamaUser asUbahNamaUser){
        this.asUbahNamaUser = asUbahNamaUser;
    }
    
    public DriverOnlineShop(UbahUsername asUbahUsername){
        this.asUbahUsername = asUbahUsername;
    }
    
    public DriverOnlineShop(MenuPenjual asMenuPenjual){
        this.asMenuPenjual = asMenuPenjual;
    }
    
    public DriverOnlineShop(MenuPembeli asMenuPembeli){
        this.asMenuPembeli = asMenuPembeli;
    }
    
    public DriverOnlineShop(SetDataToko asSetDataToko){
        this.asSetDataToko = asSetDataToko;
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
    }
    
    public DriverOnlineShop(addToKeranjang asAddToKeranjang){
        this.asAddToKeranjang = asAddToKeranjang;
    }
    
    public DriverOnlineShop(Checkout asCheckout){
        this.asCheckout = asCheckout;
    }
    
    public DriverOnlineShop(MenuAdmin asMenuAdmin){
        this.asMenuAdmin = asMenuAdmin;
    }
    
    public DriverOnlineShop(TambahAdminBaru asTambahAdminBaru){
        this.asTambahAdminBaru = asTambahAdminBaru;
    }
    
    public DriverOnlineShop(DeletePembeli asDeletePembeli){
        this.asDeletePembeli = asDeletePembeli;
    }
    
    public DriverOnlineShop(DeletePenjual asDeletePenjual){
        this.asDeletePenjual = asDeletePenjual;
    }
    
    public void statusTambahAdmin(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "admin baru berhasil ditambahkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void statusTambahAkun(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "akun berhasil di buat!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
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
    
    public void statusCheckoutBerhasil(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "transaksi berhail!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void statusCheckoutDiBatalkan(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "transaksi dibatalkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void statusDeletAkun(boolean status) {
        if (status) {
            JOptionPane.showMessageDialog(null, "akun berhasil di hapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada server!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

}
